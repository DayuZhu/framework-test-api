package com.framework.api;

import com.framework.api.mapper.ext.MerchantAccountExtMapper;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScactServiceTest {
    private static final Logger LOG = LoggerFactory.getLogger(ScactServiceTest.class);

    private static final List<Integer> LIST_TICKET_PRICE = Lists.newArrayList(100, 500, 1000, 10000, 50000, 100000);

    @Value("${shopxo.url}")
    private String b2cUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MerchantAccountExtMapper merchantAccountExtMapper;

    @Test
    public void test01() {
        LOG.info("业务 测试 ");
        Date currentTime = new Date();

    }


    @Test
    public void test05() {
        System.out.println(b2cUrl);
    }

}
