package com.fly.caipiao.comment.web.vo.request;

import javax.validation.constraints.NotNull;

/**
 * @author baidu
 * @date 2018/5/24 下午3:46
 * @description 评论注册request
 **/
public class RegisterRequestVO {
    // 用户名
    @NotNull(message = "username不能为空")
    private String username;
    // 密码
    @NotNull(message = "password不能为空")
    private String password;
    // 昵称
    private String nickname;
    // 手机号
    private String cellphone;
    // 头像
    private String logo;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
