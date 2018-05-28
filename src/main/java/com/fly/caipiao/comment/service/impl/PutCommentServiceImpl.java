package com.fly.caipiao.comment.service.impl;

import com.fly.caipiao.comment.entity.PutComment;
import com.fly.caipiao.comment.entity.PutMedia;
import com.fly.caipiao.comment.entity.PutUser;
import com.fly.caipiao.comment.enums.CommentTypeEnum;
import com.fly.caipiao.comment.framework.exceptions.BizException;
import com.fly.caipiao.comment.framework.page.PageBean;
import com.fly.caipiao.comment.framework.page.PageDataResult;
import com.fly.caipiao.comment.framework.page.PageHelp;
import com.fly.caipiao.comment.mapper.PutCommentMapper;
import com.fly.caipiao.comment.mapper.PutMediaMapper;
import com.fly.caipiao.comment.mapper.PutUserMapper;
import com.fly.caipiao.comment.service.PutCommentService;
import com.fly.caipiao.comment.web.vo.MediaVO;
import com.fly.caipiao.comment.web.vo.request.CommentRequestVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author baidu
 * @date 2018/5/24 下午4:58
 * @description 评论
 **/

@Service("commentService")
public class PutCommentServiceImpl implements PutCommentService {
    private static Logger LOGGER = LoggerFactory.getLogger(PutCommentServiceImpl.class);

    @Autowired
    private PutCommentMapper commentMapper;
    @Autowired
    private PutUserMapper userMapper;
    @Autowired
    private PutMediaMapper putMediaMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public void save(CommentRequestVO requestVO) {
        PutComment comment = new PutComment();
        BeanUtils.copyProperties(requestVO,comment);
        comment.setCreateTime(new Date());
        comment.setType(CommentTypeEnum.COMMENT.getCode());
        commentMapper.insert(comment);

        List<MediaVO> medias = requestVO.getMedias();
        if(medias !=null && medias.size() > 0){
//            List<PutMedia> list = medias.stream().map(item -> new PutMedia(item))
//                    .collect(Collectors.toList());
            List<PutMedia> list = new ArrayList<>();
            for(MediaVO mediaVO : medias){
                PutMedia media = new PutMedia(mediaVO);
                media.setCommentId(comment.getId());
                list.add(media);
            }

            putMediaMapper.insert(list);
        }

    }

    @Override
    public PageDataResult<PutComment> list(PageBean pageBean) {
        int startRow = (pageBean.getCurrent() -1)*pageBean.getPageSize();
        List<PutComment> list =  commentMapper.listComment(null,startRow,pageBean.getPageSize());
        PageDataResult<PutComment> result = PageHelp.getDataResult(list,null);
        return result;
    }

    @Override
    public void hitLike(Integer userId,Integer commentId) {
        PutUser user = userMapper.getById(userId);
        if (user == null) {
            throw new BizException("账号不存在");
        }
        PutComment comment = new PutComment();
        comment.setUserId(userId);
        comment.setParentId(commentId);
        comment.setNickname(user.getNickname());
        comment.setCreateTime(new Date());
        comment.setType(CommentTypeEnum.HIT_LIKE.getCode());
        commentMapper.insert(comment);
    }
}
