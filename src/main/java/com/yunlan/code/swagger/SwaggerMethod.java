package com.yunlan.code.swagger;

import lombok.Data;

import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:00
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@Data
public class SwaggerMethod {
    //提交路径
    private String url;

    //提交方式  GET、POST、DELETE。。。
    private String method;

    //所属Tags
    private String tags;

    //简介
    private String summary;

    //详细描述
    private String description;

    //操作ID
    private String operationId;

    //接收数据类型
    private String consumes;

    //响应类型
    private String produces;

    //响应数据
    private List<SwaggerResponse> responses;

    //参数设置
    private List<SwaggerParameters> swaggerParameters;
}
