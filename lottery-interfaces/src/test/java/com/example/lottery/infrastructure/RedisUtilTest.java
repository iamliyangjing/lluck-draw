package com.example.lottery.infrastructure;

import com.alibaba.fastjson.JSON;
import com.example.lottery.infrastructure.util.RedisUtil;
import org.junit.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @program: lluck-draw
 * @description: Redis 使用测试
 * @author: lyj
 * @create: 2023-06-10 22:04
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisUtilTest {

    private Logger logger = LoggerFactory.getLogger(RedisUtilTest.class);

    @Resource
    private RedisUtil redisUtil;

    @Test
    public void test_set() {
        redisUtil.set("lottery_user_key","xiaofuge");
    }

    @Test
    public void test_get() {
        Object user = redisUtil.get("lottery_user_key");
    }
}
