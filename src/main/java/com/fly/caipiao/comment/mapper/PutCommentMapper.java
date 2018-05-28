package com.fly.caipiao.comment.mapper;

import com.fly.caipiao.comment.entity.PutComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author baidu
 * @date 2018/5/13 下午10:30
 * @description 用户评论
 **/

@Mapper
public interface PutCommentMapper {
    /**
     * 添加评论
     * @param comment
     * @return
     */
    Integer insert(PutComment comment);

//    /**
//     * 点赞评论
//     */
//    Integer updateHit(@Param("id")Integer id);

    /**
     * 查询用户评论
     * @param userId 用户id  非必填参数，可为空
     * @return
     */
    List<PutComment> listComment(@Param("userId") Long userId,@Param("startRow") Integer startRow,
                                 @Param("pageSize") Integer pageSize);
}
