package com.valid.common;

import lombok.Getter;

/**
 * @Classname ApiException
 * @Description TODO
 * @Date 2021/12/21 17:15
 * @Author 侯凡
 */
@Getter
public class ApiException extends RuntimeException {

    private int code;

    private String message;

    public ApiException() {
        this(201, "请求错误");
    }

    public ApiException(String message) {
        this(201, message);
    }

    public ApiException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
