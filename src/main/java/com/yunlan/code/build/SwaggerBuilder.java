package com.yunlan.code.build;

import java.util.Map;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:17
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
public class SwaggerBuilder {
    /***
     * ServiceImpl构建
     * @param modelMap
     */
    public static void builder(Map<String,Object> modelMap){
        //swagger的文件名字
        modelMap.put("Table","swagger");

        //生成ServiceImpl层文件
        BuilderFactory.builder(modelMap,
                "/template/swagger",
                "swagger.json",
                TemplateBuilder.SWAGGERUI_PATH,
                ".json");
    }
}
