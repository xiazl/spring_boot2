package com.fly.caipiao.comment.service;

import com.fly.caipiao.comment.entity.PutUser;
import com.fly.caipiao.comment.web.vo.response.LoginResponseVO;

/**
 * @author baidu
 * @date 2018/5/24 下午4:58
 * @description 登录
 **/
public interface PutUserService {

    /**
     * 登录
     * @param user
     */
    void register(PutUser user);
    /**
     * 登录
     * @param username
     * @param password
     */
    LoginResponseVO login(String username, String password);

    /**
     * 密码更改
     * @param userId
     * @param oldPassWord
     * @param newPassWord
     */
    void updatePwd(Integer userId,String oldPassWord,String newPassWord);

    /**
     * 昵称更改
     * @param userId
     * @param nickName
     */
    void updateNickname(Integer userId,String nickname);
}
