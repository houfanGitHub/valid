package com.valid.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    private Long id;

    @ApiModelProperty("账号")
    @NotNull(message = "账号不能为空")
    @Size(min = 6, max = 11, message = "账号长度必须是6-11个字符")
    private String account;

    @ApiModelProperty("密码")
    @NotNull(message = "密码不能为空")
    @Size(min = 6, max = 16, message = "密码长度必须是6-16个字符")
    private String password;

    @ApiModelProperty("真实姓名")
    @NotNull(message = "真实姓名不能为空")
    private String realName;

    @ApiModelProperty("性别")
    @NotNull(message = "性别不能为空")
    @Size(max = 1, message = "性别长度必须是1个字符")
    private String gender;

    @ApiModelProperty("年龄")
    @NotNull(message = "年龄不能为空")
    private Integer age;

    @ApiModelProperty("邮箱")
    @NotNull(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;
}
