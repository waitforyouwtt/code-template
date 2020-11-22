package com.yunlan.code.build;

import java.util.Map;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:16
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
public class ServiceImplBuilder {
    /***
     * ServiceImpl构建
     * @param modelMap
     */
    public static void builder(Map<String,Object> modelMap){
        //生成ServiceImpl层文件
        BuilderFactory.builder(modelMap,
                "/template/service/impl",
                "ServiceImpl.java",
                TemplateBuilder.PACKAGE_SERVICE_INTERFACE_IMPL,
                "ServiceImpl.java");
    }
}
