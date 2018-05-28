package com.fly.caipiao.comment.web.vo;


/**
 * @author baidu
 * @date 2018/5/24 下午3:24
 * @description 返回结果
 **/
public class ApiResultVO<T> {

	private boolean success = true;

	private String message;

	private T data;

	/**
	 * constructor
	 */
	public ApiResultVO() {
		// constructor
	}

	/**
	 * constructor
	 * @param success
	 */
	public ApiResultVO(boolean success) {
		this.success = success;
	}

	/**
	 * constructor
	 * @param success
	 * @param message
	 */
	public ApiResultVO(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		this.success = false;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ApiResultVO{");
		sb.append("success=").append(success);
		sb.append(", message='").append(message).append('\'');
		sb.append(", data=").append(data);
		sb.append('}');
		return sb.toString();
	}
}
