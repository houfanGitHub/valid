package com.valid.handler;

import com.valid.common.ApiException;
import com.valid.common.ResultCode;
import com.valid.common.ResultData;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Classname GlobalExceptionHandler
 * @Description TODO
 * @Date 2021/12/7 17:59
 * @Author 侯凡
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultData<String> validExceptionHandler(MethodArgumentNotValidException e){
        //从异常对象中拿到ObjectError对象
        ObjectError error = e.getBindingResult().getAllErrors().get(0);
        //然后提取错误提示信息进行返回
        return new ResultData<String>(ResultCode.VALIDATE_FAILED, error.getDefaultMessage());
//        return error.getDefaultMessage();
    }

    @ExceptionHandler(ApiException.class)
    public ResultData<String> validExceptionHandler(ApiException e){
        //然后提取错误提示信息进行返回
//        return e.getMessage();
        return new ResultData<String>(ResultCode.FAILED, e.getMessage());
    }

}
