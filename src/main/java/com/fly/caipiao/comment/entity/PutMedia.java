package com.fly.caipiao.comment.entity;

import com.fly.caipiao.comment.web.vo.MediaVO;

import java.util.Date;

/**
 * @author baidu
 * @date 2018/5/24 下午4:21
 * @description 图片
 **/
public class PutMedia {
    /** ID */
    private Integer id;
    /** ID */
    private Integer commentId;
    /** 文件名 */
    private String fileName;
    /** 文件大小 */
    private Integer fileSize;
    /** 访问路径 */
    private String fileUrl;
    /** 创建时间 */
    private Date createTime;

    public PutMedia() {
    }

    public PutMedia(MediaVO vo) {
        this.fileName = vo.getFileName();
        this.fileSize = vo.getFileSize();
        this.fileUrl = vo.getFileUrl();
        this.createTime = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
