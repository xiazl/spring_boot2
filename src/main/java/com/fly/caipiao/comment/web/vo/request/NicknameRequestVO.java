package com.fly.caipiao.comment.web.vo.request;

import javax.validation.constraints.NotNull;

/**
 * @author baidu
 * @date 2018/5/24 下午3:46
 * @description 昵称修改request
 **/
public class NicknameRequestVO {
    // 用户Id
    @NotNull(message = "userId不能为空")
    private Integer userId;
    // 用户名
    @NotNull(message = "nickname不能为空")
    private String nickname;

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
}
