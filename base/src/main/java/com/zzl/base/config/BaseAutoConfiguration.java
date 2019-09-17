package com.zzl.base.config;

import com.zzl.base.handle.ExceptionHandle;
import com.zzl.base.handle.ResponseBodyHandle;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 自动装配
 * @author zhaozhonglong
 * @version 1.0.0
 * @date 2019/9/17 下午8:38
 */

@Import({
        ExceptionHandle.class,      // 全局异常处理
        ResponseBodyHandle.class    // 返回报文处理
})
@Configuration
public class BaseAutoConfiguration {
}
