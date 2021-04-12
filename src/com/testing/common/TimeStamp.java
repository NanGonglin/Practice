package com.testing.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname TimeStamp
 * @Description 类型说明
 * @Date 2021/4/6 18:02
 * @Created by 测试园
 */
public class TimeStamp {
    public static void main(String[] args) {
        String date = timeStamp();
        String paramresult = randomParam(date);
        System.out.println("时间戳文件名是"+paramresult);
    }

    public static String timeStamp(){
        Date date=new Date();
        SimpleDateFormat sdk=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String result=sdk.format(date);
        return result;
    }
    public static String randomParam(String timeStamp){
        String param="web-";
        param+=timeStamp;
        return  param;
    }
}
