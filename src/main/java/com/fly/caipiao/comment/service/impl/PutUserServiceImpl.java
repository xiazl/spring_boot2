package com.fly.caipiao.comment.service.impl;

import com.fly.caipiao.comment.entity.PutUser;
import com.fly.caipiao.comment.framework.exceptions.BizException;
import com.fly.caipiao.comment.mapper.PutUserMapper;
import com.fly.caipiao.comment.service.PutUserService;
import com.fly.caipiao.comment.web.vo.response.LoginResponseVO;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author baidu
 * @date 2018/5/24 下午4:58
 * @description 登录
 **/

@Service("userService")
public class PutUserServiceImpl implements PutUserService {
    private static Logger LOGGER = LoggerFactory.getLogger(PutUserServiceImpl.class);
    private final Md5PasswordEncoder PASSWORD_ENCODER = new Md5PasswordEncoder();

    @Autowired
    private StringRedisTemplate cacheStringRedisTemplate;
    @Autowired
    private PutUserMapper userMapper;

    @Override
    public void register(PutUser user) {
        PutUser account = userMapper.getByUsername(user.getUsername());
        if (account != null) {
            throw new BizException("账号已存在");
        }
        String salt = RandomStringUtils.randomAlphanumeric(8);
        String passwordSalt = PASSWORD_ENCODER.encodePassword(user.getPassword(), salt);
        user.setSalt(salt);
        user.setPassword(passwordSalt);
        user.setCreateTime(new Date());
        userMapper.insert(user);
    }

    public LoginResponseVO login(String username, String password){
        PutUser user = userMapper.getByUsername(username);
        if (user == null) {
            throw new BizException("账号不存在");
        }
        if (!verifyPassword(user.getPassword(), user.getSalt(), password)) {
            throw new BizException("密码错误");
        }
        Integer userId = user.getId();

        LoginResponseVO responseVO = new LoginResponseVO();
        responseVO.setUserId(user.getId());
        responseVO.setNickname(user.getNickname());
        responseVO.setLogo(user.getLogo());
        String token = PASSWORD_ENCODER.encodePassword(userId.toString(),user.getSalt());
        responseVO.setToken(token);

        cacheStringRedisTemplate.opsForValue().set("a","a");

        return responseVO;
    }

    @Override
    public void updatePwd(Integer userId, String oldPassWord, String newPassWord) {
        PutUser user = userMapper.getById(userId);
        if (user == null) {
            throw new BizException("账号不存在");
        }
        if (!verifyPassword(user.getPassword(), user.getSalt(), oldPassWord)) {
            throw new BizException("旧密码错误");
        }

        String passwordSalt = PASSWORD_ENCODER.encodePassword(newPassWord, user.getSalt());
        userMapper.updatePwd(userId,passwordSalt);
    }

    @Override
    public void updateNickname(Integer userId, String nickname) {
        PutUser user = userMapper.getById(userId);
        if (user == null) {
            throw new BizException("账号不存在");
        }
        userMapper.updateNickname(userId,nickname);
    }

    private boolean verifyPassword(String dbPassword, String salt, String password) {
        String saltPassword = PASSWORD_ENCODER.encodePassword(password, salt);
        return saltPassword.equals(dbPassword);
    }
}
