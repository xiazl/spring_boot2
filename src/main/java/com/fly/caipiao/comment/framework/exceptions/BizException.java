package com.fly.caipiao.comment.framework.exceptions;

/**
 * @author baidu
 * @date 2018/5/20 下午10:30
 * @description 异常类
 **/

public class BizException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// 错误码
	private int code;
	// 错误信息
	private String message;

	public int getCode() {
		return code;
	}

	public BizException() {
	}

	public BizException(String message) {
		super(message);
	}


	public BizException(String message, int code) {
		super(message);
		this.code = code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
