package com.fly.caipiao.comment.web.vo.request;

import javax.validation.constraints.NotNull;

/**
 * @author baidu
 * @date 2018/5/24 下午3:46
 * @description 密码修改request
 **/
public class PwdRequestVO {
    // 用户Id
    @NotNull(message = "userId不能为空")
    private Integer userId;
    // 用户名
    @NotNull(message = "oldPassword不能为空")
    private String oldPassword;
    // 密码
    @NotNull(message = "newPassword不能为空")
    private String newPassword;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
