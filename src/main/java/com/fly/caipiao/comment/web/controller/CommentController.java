package com.fly.caipiao.comment.web.controller;

import com.fly.caipiao.comment.entity.PutComment;
import com.fly.caipiao.comment.framework.page.PageBean;
import com.fly.caipiao.comment.framework.page.PageDataResult;
import com.fly.caipiao.comment.service.PutCommentService;
import com.fly.caipiao.comment.web.vo.ApiResultVO;
import com.fly.caipiao.comment.web.vo.request.CommentRequestVO;
import com.fly.caipiao.comment.web.vo.request.HitRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author baidu
 * @date 2018/5/24 下午9:05
 * @description ${TODO}
 **/

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private PutCommentService commentService;
    /**
     * 添加评论
     * @param requestVO
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ApiResultVO save(@RequestBody @Valid CommentRequestVO requestVO){
        commentService.save(requestVO);
        return new ApiResultVO();
    }

    /**
     * 点赞
     * @param requestVO
     * @return
     */
    @RequestMapping(value = "/hitLike",method = RequestMethod.POST)
    public ApiResultVO hit(@RequestBody HitRequestVO requestVO){
        commentService.hitLike(requestVO.getUserId(),requestVO.getCommentId());
        return new ApiResultVO();
    }


    /**
     * 查询评论
     * @param pageBean
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ApiResultVO<PageDataResult<PutComment>> list(PageBean pageBean){
        ApiResultVO resultVO = new ApiResultVO();
        resultVO.setData(commentService.list(pageBean));
        return resultVO;
    }
}
