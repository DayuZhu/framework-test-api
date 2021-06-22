package com.framework.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.framework.api.commons.web.util.ValidatorUtil;
import com.framework.api.request.UserRequest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class MainServiceTest {

    private static final Logger LOG = LoggerFactory.getLogger(MainServiceTest.class);

    @Test
    public void test01() {
        LOG.info("测试 test01");
        System.out.println(Math.random() * 9 + 1);
        Map<String, Object> stringObjectMap = JSON.parseObject("{}", new TypeReference<Map<String, Object>>() {
        });
        System.out.println(stringObjectMap);
        UserRequest userRequest = JSON.parseObject("{}", new TypeReference<UserRequest>() {
        });
        ValidatorUtil.validateBean(userRequest);
        System.out.println(userRequest);
    }


}
