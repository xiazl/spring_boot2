package com.fly.caipiao.comment.web.vo.request;

import javax.validation.constraints.NotNull;

/**
 * @author baidu
 * @date 2018/5/13 下午10:30
 * @description 点赞request
 **/
public class HitRequestVO {

    // 用户Id
    @NotNull(message = "userId不能为空")
    private Integer userId;
    // 评论Id
    @NotNull(message = "commentId不能为空")
    private Integer commentId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }
}
