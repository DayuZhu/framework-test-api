package com.framework.api.commons.web.base;

/**
 * 接口返回码
 * 
 * <p/>
 * 
 * @author <a href="mailto:zhangraty@gmail.com">Raty Zhang</a>
 * @version  Date: 2018年12月27日 上午9:49:16
 * @serial 1.0
 * @since 2018年12月27日 上午9:49:16
 */
public enum RespCode {
	//--------global begin--------
	SUCCESS(0, "成功"),
	API_NOT_EXIST(404, "接口不存在"),
	PARAM_ERROR(10001, "参数错误"),
	REQUEST_ERROR(10002, "非法请求"),
	TOKEN_ERROR(10003, "token错误，为空或已过期"),
	DB_ERROR(10004, "数据访问异常"),
	INVITE_CODE_NOT_EXIST(10016, "验证码不正确"),
	//--------global end  --------
	
	//--------用户模块 begin--------
	USER_NOT_EXIST_ERROR(11001,"用户不存在"),
	USER_EXIST_ERROR(11002,"用户已存在"),
	USER_ACCOUNT_ERROR(11003,"用户账户或密码错误"),
	USER_DISABLE_ERROR(11004,"用户被禁用"),
	USER_MOBILE_ERROR(11005,"用户手机号码错误"),
	USER_ORIG_PASSWORD_ERROR(11006,"用户原密码错误"),
	USER_PERMISSION_ERROR(11007,"用户无权操作"),
	//--------用户模块 end  --------
	
	UNKNOWN_ERROR(99999, "未知异常！");
	
	

	/**
	 * 代码
	 */
	private final int code;
	/**
	 * 信息
	 */
	private final String message;

	/**
	 * 
	 * @param code
	 *            响应码
	 * @param message
	 *            生产环境下的响应消息
	 */
	private RespCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

}
