package com.hwh.usercenter.common;

import lombok.Getter;

@Getter
public enum ErrorCode {
    SUCCESS(0, "ok", ""),
    PARAMS_ERROR(40000, "request param error", ""),
    NULL_ERROR(40001, "request data is null", ""),
    NO_AUTH(40101, "无权限", ""),
    NOT_LOGIN(40100, "未登录",""),
    SYSTEM_ERROR(50000, "系统异常","");

    private final int code;
    private final String message;
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

}
