package com.fly.caipiao.comment.web.vo.response;

/**
 * @author baidu
 * @date 2018/5/24 下午3:53
 * @description 登录返回
 **/
public class LoginResponseVO {
    // 用户ID
    private Integer userId;
    // 昵称
    private String nickname;
    // logo
    private String logo;
    // 登录成功返回token
    private String token;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
