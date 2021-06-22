package com.framework.api.commons.web.base;


/**
 * 抽象命令接口
 * <p/>
 *
 * @author <a href="mailto:zhangraty@gmail.com">Raty Zhang</a>
 * @version Date: 2017年9月5日 下午4:27:50
 * @serial 1.0
 * @since 2017年9月5日 下午4:27:50
 */
public interface ICommand {
    /**
     * 鉴权
     * <p>
     * <p/>
     *
     * @return
     * @author Raty Zhang
     * @date 2017年9月6日 下午4:29:08
     */
    public void auth(ApiRequest req) throws ApiException;

    /**
     * 返回响应信息，以ApiResponse对象形式
     * <p/>
     *
     * @param req
     * @return
     * @throws ApiException
     * @author Raty Zhang
     * @date 2017年9月6日 下午4:28:26
     */
    public ApiResponse execute(ApiRequest req) throws ApiException;

}
