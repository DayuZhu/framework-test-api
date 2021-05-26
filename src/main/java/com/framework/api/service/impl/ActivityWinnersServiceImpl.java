package com.framework.api.service.impl;

import com.alibaba.fastjson.JSON;

import com.framework.api.mapper.ext.MerchantAccountExtMapper;
import com.framework.api.model.bo.ExcelWinnersInfoBmo;
import com.framework.api.service.ActivityWinnersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

/**
 * 功能描述:活动中奖名服务实现类
 *
 * @className:ActivityWinnersServiceImpl
 * @projectName:
 * @author: generater-code
 * @date: 2019-11-17 18:34:48
 */
@Service
public class ActivityWinnersServiceImpl implements ActivityWinnersService {


    @Value("${shopxo.url}")
    private String b2cUrl;

    private static final Logger LOG = LoggerFactory.getLogger(ActivityWinnersServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private MerchantAccountExtMapper merchantAccountExtMapper;



    @Override
    public void handlerWinnersInfo(List<ExcelWinnersInfoBmo> list, Integer activityId) {
        LOG.info("进入处理中奖名单服务请求参数list={} activityId={}", JSON.toJSONString(list), activityId);
        //

        Date currentTime = new Date();
//        int updateAccFlag = merchantAccountExtMapper.updateByBalanceAndMerchantIdSelective(
//                currentTime,
//                sum,
//                balance,
//                activity.getMerchantId());




    }


}
