package com.yunlan.code.swagger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 16:58
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SwaggerModelProperties implements Serializable {

    //属性名字
    private String name;

    //类型
    private String type;

    //格式
    private String format;

    //描述
    private String description;
}
