package com.zzl.base.exception;


import com.zzl.base.enums.ResultEnum;

/**
 * @author zhaozhonglong
 * 2019-06-07 16:10
 */
public class AppException extends RuntimeException{

    private Integer code;

    public AppException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
