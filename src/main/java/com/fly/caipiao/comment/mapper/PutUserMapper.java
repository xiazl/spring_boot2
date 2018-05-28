package com.fly.caipiao.comment.mapper;

import com.fly.caipiao.comment.entity.PutUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author baidu
 * @date 2018/5/13 下午10:30
 * @description 用户信息表mapper
 **/

@Mapper
public interface PutUserMapper {
    /**
     * 插入用户
     * @param user
     * @return
     */
    Integer insert(PutUser user);

    /**
     * 查询用户
     * @param username
     * @return
     */
    PutUser getByUsername(@Param("username") String username);

    /**
     * 查询用户
     * @param id
     * @return
     */
    PutUser getById(@Param("id") Integer id);

    /**
     * 更新密码
     * @param id
     * @param pwd
     * @return
     */
    Integer updatePwd(@Param("id") Integer id,@Param("pwd")String pwd);

    /**
     * 更新昵称
     * @param id
     * @param nickname
     * @return
     */
    Integer updateNickname(@Param("id") Integer id,@Param("nickname")String nickname);
}
