package com.example.omgzui.enums;

public enum ResultEnum {
    UNKNOWN_ERROR(-1, "未知错误"),
    SUCCESS(200, "成功"),
    PRIMARY_SCHOOL(100, "我猜你可能还在上小学"),
    MIDDLE_SCHOOL(101, "你可能在上初中"),

    ;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
