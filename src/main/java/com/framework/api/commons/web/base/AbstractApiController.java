package com.framework.api.commons.web.base;


import com.alibaba.fastjson.JSON;
import com.framework.api.commons.web.constant.CommonConstant;
import com.framework.api.commons.web.enums.ResultEnum;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 *
 */
public abstract class AbstractApiController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());


    /**
     * @param httpRequest
     * @param httpResponse
     * @return
     */
    protected ApiResponse doPost(HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
        // 获取请求数据

        String reqString = null;
        try (ServletInputStream inputStream = httpRequest.getInputStream()) {
            reqString = IOUtils.toString(inputStream, CommonConstant.UTF_8);
        } catch (IOException ex) {
            logger.warn("---api post inputStream error", ex);
        }
        if (StringUtils.isBlank(reqString)) {
            return new ApiResponse();
        }
        ApiRequest req = new ApiRequest(reqString);
        logger.info("---api request[{}] params={}", req.getReqId(), reqString);
        String beanName = req.getParameter("cmd");
        if (StringUtils.isBlank(beanName)) {
            logger.error("未传入cmd");
            throw new BaseRuntimeException(ResultEnum.PARAM_ERROR);
        }
        beanName = beanName + "Command";
        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        ICommand cmd = wac.getBean(beanName, ICommand.class);
        //鉴权
        cmd.auth(req);
        // 方法调用
        return cmd.execute(req);
    }

    /**
     * 收尾处理
     * <p>
     * <p/>
     *
     * @param req
     * @param res
     * @author Raty Zhang
     * @date 2018年12月27日 下午1:39:35
     */
    private void doEnd(ApiRequest req, ApiResponse res) {
        try {
            if (req != null) {
                String reqId = req.getReqId();
                res.setReqId(reqId);
                res.setServiceTime(new Date());
                logger.info("---api response[{}] data={}", reqId, JSON.toJSONString(res));
            } else {
                logger.info("---api response data={}", JSON.toJSONString(res));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
