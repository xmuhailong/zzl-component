package com.zzl.base.handle;

import com.zzl.base.domain.Result;
import com.zzl.base.exception.AppException;
import com.zzl.base.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhaozhonglong
 * 2019-06-07 16:10
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

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
}
