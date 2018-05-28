package com.fly.caipiao.comment.web.vo.request;

import javax.validation.constraints.NotNull;

/**
 * @author baidu
 * @date 2018/5/24 下午3:46
 * @description 评论登录
 **/
public class LoginRequestVO {
    // 用户名
    @NotNull(message = "username不能为空")
    private String username;
    // 密码
    @NotNull(message = "password不能为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
