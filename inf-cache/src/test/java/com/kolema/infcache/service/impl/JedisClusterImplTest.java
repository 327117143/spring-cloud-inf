package com.kolema.infcache.service.impl;

import com.kolema.infcache.service.IRedisService;
import org.junit.Test;

import javax.annotation.Resource;

public class JedisClusterImplTest {

    @Resource
    private IRedisService redisService;

    @Test
    public void set() {

        System.out.println(redisService.set("Z:TEST", "12345678"));

    }
}