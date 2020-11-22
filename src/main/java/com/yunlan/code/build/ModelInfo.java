package com.yunlan.code.build;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:07
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelInfo implements Serializable {

    //属性类型
    private String type;

    //类型-只有名字
    private String simpleType;

    //属性名字
    private String name;

    //首字母大写属性名字
    private String upperName;

    //属性描述
    private String desc;

    //是否是主键
    private Boolean id;

    //列名
    private String column;

    //是否自增  YES自增，NO：非自增
    private String identity;
}
