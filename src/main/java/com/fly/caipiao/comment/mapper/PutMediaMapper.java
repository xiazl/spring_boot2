package com.fly.caipiao.comment.mapper;

import com.fly.caipiao.comment.entity.PutMedia;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author baidu
 * @date 2018/5/13 下午10:30
 * @description 图片mapper
 **/

@Mapper
public interface PutMediaMapper {
    /**
     * 插入评论
     * @param media
     * @return
     */
    Integer insert(List<PutMedia> media);

}
