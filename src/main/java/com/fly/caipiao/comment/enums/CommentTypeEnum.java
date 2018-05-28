package com.fly.caipiao.comment.enums;

/**
 * @author baidu
 * @date 2018/5/27 下午8:41
 * @description ${TODO}
 **/
public enum  CommentTypeEnum {
    HIT_LIKE(0,"点赞"),
    COMMENT(1,"评论")
    ;
    private int code;
    private String message;

    CommentTypeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
