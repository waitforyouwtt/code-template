package com.yunlan.code.build;

import java.util.Map;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:15
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
public class DaoBuilder {

    /***
     * 构建Dao
     * @param modelMap
     */
    public static void builder(Map<String,Object> modelMap){
        //生成Dao层文件
        BuilderFactory.builder(modelMap,
                "/template/dao",
                "Mapper.java",
                TemplateBuilder.PACKAGE_MAPPER,
                "Mapper.java");
    }
}
