package com.zzl.base.utils;


import com.zzl.base.domain.Result;

/**
 * @author zhaozhonglong
 * 2019-06-07 16:10
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode("200");
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(String code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
