package com.zzl.base.enums;

/**
 * @author zhaozhonglong
 * 2019-06-07 16:10
 */

public enum ResultEnum {

    SUCCESS("200", "成功"),
    PRIMARY_SCHOOL("100", "我猜你可能还在上小学"),
    MIDDLE_SCHOOL("101", "你可能在上初中"),
    // 1000错误为系统错误
    DEAL_RESPONSE_ERROR("1000", "处理返回报文出错"),
    UNKONW_ERROR("1001", "未知错误"),

    // 2000错误为业务逻辑错误
    CREATE_PASSWORD_ERROR("2000", "创建用户密码出错"),
    ;

    private String code;

    private String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
