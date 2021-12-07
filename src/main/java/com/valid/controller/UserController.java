package com.valid.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.valid.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2021/12/7 10:36
 * @Author 侯凡
 */
@RestController
@RequestMapping("user")
@Api(value = "用户管理", description = "用户增删改查")
public class UserController {

    @ApiOperation("保存用户")
    @PostMapping("add")
    public String add(@RequestBody User user){
        //参数校验
        if(Objects.isNull(user) || Objects.isNull(user.getId()) || Objects.isNull(user.getAccount())
                || Objects.isNull(user.getPassword())|| Objects.isNull(user.getEmail())
        ){
            return "对象或者对象字段不能为空";
        }
        if (StringUtils.isEmpty(user.getAccount()) || StringUtils.isEmpty(user.getPassword()) || StringUtils.isEmpty(user.getEmail())) {
            return "不能输入空字符串";
        }
        if (user.getAccount().length() < 6 || user.getAccount().length() > 11) {
            return "账号长度必须是6-11个字符";
        }
        if (user.getPassword().length() < 6 || user.getPassword().length() > 16) {
            return "账号长度必须是6-16个字符";
        }
        if (!Pattern.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", user.getEmail())) {
            return "邮箱格式不正确";
        }
        //直接返回业务逻辑
        return "success";
    }


    @ApiOperation("查询用户")
    @PostMapping("select")
    public String select(
            @RequestBody @ApiParam(
                    name = "param",value = "{\"id\":\"string\"}") Map<String, String> param){
        if(StringUtils.isEmpty(param.get("id"))){
            return "id不能为空";
        }
        return "success";
    }
}
