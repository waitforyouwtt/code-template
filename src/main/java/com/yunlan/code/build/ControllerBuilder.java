package com.yunlan.code.build;

import java.util.Map;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:14
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
public class ControllerBuilder {

    /***
     * 构建Controller
     * @param modelMap
     */
    public static void builder(Map<String,Object> modelMap){
        //生成Controller层文件
        BuilderFactory.builder(modelMap,
                "/template/controller",
                "Controller.java",
                TemplateBuilder.PACKAGE_CONTROLLER,
                "Controller.java");
    }

}
