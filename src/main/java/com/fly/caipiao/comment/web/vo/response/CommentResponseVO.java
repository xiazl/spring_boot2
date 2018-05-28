package com.fly.caipiao.comment.web.vo.response;

import com.fly.caipiao.comment.web.vo.CommentVO;
import com.fly.caipiao.comment.web.vo.HitVO;
import com.fly.caipiao.comment.web.vo.MediaVO;

import java.util.Date;
import java.util.List;

/**
 * @author baidu
 * @date 2018/5/13 下午10:30
 * @description 评论列表返回
 **/
public class CommentResponseVO {
    // 主键Id
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
    // 评论详情
    private List<CommentVO> contents;
    // 图片
    private List<MediaVO> medias;
    // 点赞
    private List<HitVO> likes;


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

    public List<CommentVO> getContents() {
        return contents;
    }

    public void setContents(List<CommentVO> contents) {
        this.contents = contents;
    }

    public List<MediaVO> getMedias() {
        return medias;
    }

    public void setMedias(List<MediaVO> medias) {
        this.medias = medias;
    }

    public List<HitVO> getLikes() {
        return likes;
    }

    public void setLikes(List<HitVO> likes) {
        this.likes = likes;
    }
}
