package com.zzl.base.exception;


import com.zzl.base.enums.ResultEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhaozhonglong
 * 2019-06-07 16:10
 */

@Data
@NoArgsConstructor
public class AppException extends RuntimeException{

    private String code;
    private String msg;

    public AppException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());

        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

}
