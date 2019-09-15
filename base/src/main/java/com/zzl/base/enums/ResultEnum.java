package com.zzl.base.enums;

/**
 * @author zhaozhonglong
 * 2019-06-07 16:10
 */
public enum ResultEnum {
    UNKONW_ERROR("-1", "未知错误"),
    SUCCESS("200", "成功"),
    PRIMARY_SCHOOL("100", "我猜你可能还在上小学"),
    MIDDLE_SCHOOL("101", "你可能在上初中"),
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
