package com.yunlan.code.swagger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 16:54
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SwaggerModel {

    //名字
    private String name;

    //类型
    private String type;

    //字段集合
    private List<SwaggerModelProperties> properties;

    //描述
    private String description;

}
