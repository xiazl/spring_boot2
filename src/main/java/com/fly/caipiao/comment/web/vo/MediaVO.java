package com.fly.caipiao.comment.web.vo;

/**
 * @author baidu
 * @date 2018/5/27 下午5:03
 * @description 图片vo
 **/
public class MediaVO {
    // 主键ID
    private Integer id;
    // 访问URL
    private String fileUrl;
    // 图片大小
    private Integer fileSize;
    // 图片名称
    private String fileName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
