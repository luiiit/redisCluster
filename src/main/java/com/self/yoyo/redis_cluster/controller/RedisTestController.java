package com.self.yoyo.redis_cluster.controller;

import com.self.yoyo.redis_cluster.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lujifa@jxtech
 * @version 1.0.0
 * @Description redis集群测试
 * @createTime 2021年12月23日 10:11:00
 */
@RestController
@RequestMapping("/test")
public class RedisTestController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/set")
    public Boolean set(String key,String value){
       return redisUtil.set(key,value);
    }

    @RequestMapping("/get")
    public Object get(String key){
        return redisUtil.get(key);
    }
}
