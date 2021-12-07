package com.valid.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Classname Swagger2Config
 * @Description TODO
 * @Date 2021/12/7 11:04
 * @Author 侯凡
 */
@SpringBootConfiguration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket getDocket(){
        ApiInfo apiInfo=new ApiInfoBuilder()
                .title("用户管理")//api标题
                .description("用户管理相关接口描述")//api描述
                .version("1.0.0")//版本号
                .contact("hf")//本API负责人的联系信息
                .build();
        return new Docket(DocumentationType.SWAGGER_2)//文档类型（swagger2）
                .apiInfo(apiInfo)//设置包含在json ResourceListing响应中的api元信息
                .select()//启动用于api选择的构建器
                .apis(RequestHandlerSelectors.basePackage("com.valid"))//扫描接口的包
                .paths(PathSelectors.any())//路径过滤器（扫描所有路径）
                .build();
    }
}
