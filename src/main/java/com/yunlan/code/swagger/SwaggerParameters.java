package com.yunlan.code.swagger;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:01
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@Data
public class SwaggerParameters implements Serializable {

    //输入类型 body
    private String in;

    //输入名字介绍  Album对象
    private String name;

    //输入描述
    private String description;

    //是否是必须输入
    private Boolean required;

    //引用对象
    private String schema;

    //类型
    private String type;

    //format
    private String format;
}
