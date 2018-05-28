package com.fly.caipiao.comment.web.vo.request;

import com.fly.caipiao.comment.web.vo.MediaVO;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author baidu
 * @date 2018/5/13 下午10:30
 * @description 评论request
 **/
public class CommentRequestVO {
    // 主键Id
    private Integer id;
    // 父级Id(评论回复Id)
    private Integer parentId;
    // 用户Id
    @NotNull(message = "userId不能为空")
    private Integer userId;
    // 用户头像(url)
    private String logo;
    // 用户昵称
    @NotNull(message = "nickname不能为空")
    private String nickname;
    // 评论内容
    @NotNull(message = "content不能为空")
    private String content;

    // 图片
    private List<MediaVO> medias;

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

    public List<MediaVO> getMedias() {
        return medias;
    }

    public void setMedias(List<MediaVO> medias) {
        this.medias = medias;
    }
}
