package com.yunlan.code.swagger;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 16:59
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@Data
public class SwaggerPath implements Serializable {

    //请求路径
    private String path;

    //方法配置
    private List<SwaggerMethod> methods;

    //对象
    private String model;

    //对象-首字母小写
    private String table;

    public SwaggerPath(String Table, String table) {
        this.model = Table;
        this.table = table;
    }
}
