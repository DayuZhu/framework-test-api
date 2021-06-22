package com.framework.api.commons.web.base;


import com.alibaba.fastjson.JSON;
import com.framework.api.commons.web.enums.ResultEnum;
import com.framework.api.commons.web.util.SpringUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 *
 */
public abstract class AbstractUriController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * @param uriRequest
     * @return
     */
    protected UriResponse doPost(UriRequest uriRequest) {
        // 获取请求数据

        String beanName = uriRequest.getSh();
        if (StringUtils.isBlank(beanName)) {
            logger.error("未传入sh");
            throw new BaseRuntimeException(ResultEnum.PARAM_ERROR);
        }
        beanName = beanName + "UriSaasShell";
        IUriSaasShell sh = SpringUtil.getBean(beanName, IUriSaasShell.class);
        //        //鉴权
        sh.auth(uriRequest);
        // 方法调用
        return sh.execute(uriRequest);
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
