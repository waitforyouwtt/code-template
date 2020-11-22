package com.yunlan.code.swagger;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:00
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@Data
public class SwaggerResponse implements Serializable {

    //响应状态码  200,404.。。
    private int code;

    //描述
    private String description;

    //响应引用
    private String schema;
}
