package com.fly.caipiao.comment.web.vo;

import java.util.Date;

/**
 * @author baidu
 * @date 2018/5/27 下午5:02
 * @description 评论vo
 **/
public class CommentVO {
    // 主键ID
    private Integer id;
    // 用户Id
    private Long userId;
    // 用户头像(url)
    private String logo;
    // 用户昵称
    private String nickname;
    // 评论内容
    private String content;
    // 创建时间
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
