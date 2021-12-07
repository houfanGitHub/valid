package com.valid.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Classname User
 * @Description TODO
 * @Date 2021/12/7 10:39
 * @Author 侯凡
 */
@Data
@ApiModel("用户")
public class User {

    @ApiModelProperty("id")
    private long id;

    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("真实姓名")
    private String realName;

    @ApiModelProperty("性别")
    private char gender;

    @ApiModelProperty("年龄")
    private int age;

    @ApiModelProperty("邮箱")
    private String email;
}
