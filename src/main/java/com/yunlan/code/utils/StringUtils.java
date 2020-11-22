package com.yunlan.code.utils;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2020/11/22 17:05
 * @Version: 1.0
 * @Email: 15290810931@163.com
 */
public class StringUtils {

    /***
     * 首字母大写
     * @param str
     * @return
     */
    public static String firstUpper(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }

    /**
     * 首字母小写
     * @param str
     * @return
     */
    public static String firstLower(String str){
        return str.substring(0,1).toLowerCase()+str.substring(1);
    }

    /***
     * 移除tab_,tb_
     * @return
     */
    public static String replaceTab(String str){
        return str.replaceFirst("tab_","").replaceFirst("tb_","");
    }

    /***
     * 将下划线替换掉
     * @param str
     * @return
     */
    public static String replace_(String str){
        //根据下划线分割
        String[] split = str.split("_");
        //循环组装
        String result = split[0];
        if(split.length>1){
            for (int i = 1; i < split.length; i++) {
                result+=firstUpper(split[i]);
            }
        }
        return result;
    }
}
