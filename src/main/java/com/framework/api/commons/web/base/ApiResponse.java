package com.framework.api.commons.web.base;

import java.io.Serializable;
import java.util.Date;

/**
 * api接口返回类
 * 
 * <p/>
 * 
 * @author <a href="mailto:zhangraty@gmail.com">Raty Zhang</a>
 * @version Date: 2018年12月27日 上午10:38:22
 * @serial 1.0
 * @since 2018年12月27日 上午10:38:22
 */
public class ApiResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5975225436042590714L;
	/**
	 * 接口提交状态。 只有0表示成功，其它值请参照各接口错误码说明。
	 */
	private int respCode = 0;
	/**
	 * 接口调用失败时的错误消息.
	 */
	private String respDesc;
	/**
	 * 对应请求id
	 */
//	@JsonIgnore
	private String reqId;
	/**
	 * 服务器时间.
	 */
	// @JsonFormat(pattern = Constants.DATEFORMAT_DEFAULT, timezone =
	// Constants.TIMEZONE)
	private Date serviceTime;
	/**
	 * 具体数据. 依接口返回值而定.
	 */
	private Object data;

	public ApiResponse() {
	}

	public ApiResponse(int respCode, String msg) {
		this.respCode = respCode;
		this.respDesc = msg;
	}

	public ApiResponse(int respCode, String msg, Object data) {
		this.respCode = respCode;
		this.respDesc = msg;
		this.data = data;
	}

	public ApiResponse(RespCode code) {
		this.respCode = code.getCode();
		this.respDesc = code.getMessage();
	}

	public ApiResponse(RespCode code, Object data) {
		this.respCode = code.getCode();
		this.respDesc = code.getMessage();
		this.data = data;
	}

	public int getRespCode() {
		return respCode;
	}

	public void setRespCode(int respCode) {
		this.respCode = respCode;
	}

	public String getRespDesc() {
		return respDesc;
	}

	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Date getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(Date serviceTime) {
		this.serviceTime = serviceTime;
	}
}
