package com.yunlan.code.build;

import freemarker.template.Template;

import java.io.File;
import java.util.Map;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:12
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
public class BuilderFactory {

    /***
     * 构建Controller
     * @param modelMap
     */
    public static void builder(Map<String,Object> modelMap,//数据模型
                               String templatePath, //模板路径
                               String templateFile, //模板文件
                               String storePath,    //存储路径
                               String suffix){      //生成文件后缀名字
        try {
            //获取模板对象
            Template template = TemplateUtil.loadTemplate(ControllerBuilder.class.getResource(templatePath).getPath(), templateFile);

            //创建文件夹
            String path = TemplateBuilder.PROJECT_PATH+storePath.replace(".","/");
            File file = new File(path);
            if(!file.exists()){
                file.mkdirs();
            }

            //创建文件
            TemplateUtil.writer(template,modelMap,path+"/"+modelMap.get("Table")+suffix);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
