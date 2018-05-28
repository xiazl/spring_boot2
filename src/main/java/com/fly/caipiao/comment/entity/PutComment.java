package com.fly.caipiao.comment.entity;

import java.util.Date;

/**
 * @author baidu
 * @date 2018/5/13 下午10:30
 * @description 用户评论
 **/
public class PutComment {
    // 主键Id
    private Integer id;
    // 用户Id
    private Integer userId;
    // 父级Id(评论回复Id)
    private Integer parentId;
    // 用户头像(url)
    private String logo;
    // 用户昵称
    private String nickname;
    // 评论内容
    private String content;
    //
    private Integer type;
    // 创建时间
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
