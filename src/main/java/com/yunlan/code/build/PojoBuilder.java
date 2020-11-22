package com.yunlan.code.build;

import java.util.Map;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:11
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
public class PojoBuilder {

    /***
     * 构建Pojo
     * @param dataModel
     */
    public static void builder(Map<String,Object> dataModel){
        //生成entity层文件
        BuilderFactory.builder(dataModel,
                "/template/entity",
                "Entity.java",
                TemplateBuilder.PACKAGE_ENTITY,
                ".java");
    }

}
