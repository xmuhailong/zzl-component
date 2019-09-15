package com.zzl.base.exception;


import com.zzl.base.enums.ResultEnum;

/**
 * @author zhaozhonglong
 * 2019-06-07 16:10
 */
public class AppException extends RuntimeException{

    private String code;

    public AppException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
