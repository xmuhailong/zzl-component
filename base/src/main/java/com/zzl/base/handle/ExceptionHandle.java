package com.zzl.base.handle;

import com.zzl.base.domain.Result;
import com.zzl.base.exception.AppException;
import com.zzl.base.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 异常统一处理
 * @author zhaozhonglong
 * 2019-06-07 16:10
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    /**
     * @description 全局异常
     * @param [e]
     * @return com.zzl.base.domain.Result
     * @author zhaozhonglong
     * @date  2021/1/16 22:50:15
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof AppException) {
            AppException appException = (AppException) e;
            return ResultUtil.error(appException.getCode(), appException.getMessage());
        }else {
            logger.error("【系统异常】{}", e);
            return ResultUtil.error("-1", "未知错误");
        }
    }

    /**
     * 拦截捕捉自定义异常 MyException.class
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = AppException.class)
    public Result appExceptionHandler(AppException e) {

        return ResultUtil.error(e.getCode(), e.getMessage());
    }
}
