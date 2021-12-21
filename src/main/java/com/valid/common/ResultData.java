package com.valid.common;

import lombok.Data;

/**
 * @Classname ResultData
 * @Description TODO
 * @Date 2021/12/21 17:41
 * @Author 侯凡
 */
@Data
public class ResultData<T> {

    private int code;

    private String message;

    private T data;

    public ResultData(T data) {
        this(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg());
        this.data = data;
    }

    public ResultData(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultData(ResultCode resultCode, T data) {
        this(resultCode.getCode(), resultCode.getMsg());
        this.data = data;
    }

    public ResultData(int code, String message, T data) {
        this(code, message);
        this.data = data;
    }
}
