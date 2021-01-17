package com.zzl.base.handle;

import com.zzl.base.domain.Result;
import com.zzl.base.enums.ResultEnum;
import com.zzl.base.exception.AppException;
import com.zzl.base.utils.ResultUtil;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 返回报文格式处理-只针对controller处理
 * @author zhaozhonglong
 * @version 1.0.0
 * @date 2019/9/17 下午8:21
 */

@ControllerAdvice
public class ResponseBodyHandle implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object obj, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {

        return obj instanceof Result ? obj : ResultUtil.success(obj);
    }
}
