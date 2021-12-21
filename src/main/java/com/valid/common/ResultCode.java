package com.valid.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  ResultCode {
    
    SUCCESS(200,"操作成功"),
    
    FAILED(201,"响应失败"),
    
    VALIDATE_FAILED(202,"参数校验失败"),
    
    ERROR(500,"未知错误"),
    
    ;
    /**
     * 响应码
     */
    private int code;

    /**
     * 提示消息
     */
    private String msg;
}
