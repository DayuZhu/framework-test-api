package com.framework.api.commons.web.base;

/**
 * api接口异常
 * <p/>
 *
 * @author <a href="mailto:zhangraty@gmail.com">Raty Zhang</a>
 * @version Date: 2017年9月5日 下午4:23:11
 * @serial 1.0
 * @since 2017年9月5日 下午4:23:11
 */
public class ApiException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 8470807580103383615L;
    private int errorCode;
    private String errorMessage;

    // please do not delete
    public ApiException() {

    }

    public ApiException(RespCode respCode) {
        super(respCode.getMessage());
        this.errorCode = respCode.getCode();
        this.errorMessage = respCode.getMessage();
    }

    public ApiException(int errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ApiException(String errorMessage) {
        super(errorMessage);
        this.errorCode = -1;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}