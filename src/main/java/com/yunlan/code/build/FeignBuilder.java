package com.yunlan.code.build;

import java.util.Map;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:17
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
public class FeignBuilder {
    /***
     * 构建Feign
     * @param modelMap
     */
    public static void builder(Map<String,Object> modelMap){
        BuilderFactory.builder(modelMap,
                "/template/feign",
                "Feign.java",
                TemplateBuilder.PACKAGE_FEIGN,
                "Feign.java");
    }
}
