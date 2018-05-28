package com.fly.caipiao.comment.entity;

import java.util.Date;

/**
 * @author baidu
 * @date 2018/5/24 下午4:21
 * @description 用户信息
 **/
public class PutUser {
    /** 用户ID */
    private int id;
    /** 用户名 */
    private String username;
    /** 密码 */
    private String password;
    /** 盐 */
    private String salt;
    /** 昵称 */
    private String nickname;
    /** 手机号 */
    private String cellphone;
    /** 头像(url) */
    private String logo;
    /** 创建时间 */
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
