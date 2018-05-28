package com.fly.caipiao.comment.service;

import com.fly.caipiao.comment.entity.PutComment;
import com.fly.caipiao.comment.framework.page.PageBean;
import com.fly.caipiao.comment.framework.page.PageDataResult;
import com.fly.caipiao.comment.web.vo.request.CommentRequestVO;

/**
 * @author baidu
 * @date 2018/5/24 下午4:58
 * @description 评论
 **/
public interface PutCommentService {
    /**
     * 添加评论
     * @param requestVO
     */
    void save(CommentRequestVO requestVO);

    /**
     * 查询用户品论
     * @param pageBean 分页参数
     * @return
     */
    PageDataResult<PutComment> list(PageBean pageBean);

    /**
     * 点赞
     * @param userId
     */
    void hitLike(Integer userId,Integer commentId);
}
