package com.zzl.myredis;

import com.zzl.myredis.utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhaozhonglong
 * @description
 * @date 2019/6/2 下午11:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
    @Test
    public void set() {
        RedisUtils.set("abc","adfd");
    }

    @Test
    public void get() {
        System.out.println(RedisUtils.get("abc"));
    }

}
