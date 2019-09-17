package com.zzl.myredis.config;

import com.zzl.myredis.utils.SpringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zhaozhonglong
 * @version 1.0.0
 * @date 2019/9/17 下午8:59
 */

@Import({
        CacheConfig.class,
        SpringUtils.class
})
@Configuration
public class RedisAutoConfiguration {
}
