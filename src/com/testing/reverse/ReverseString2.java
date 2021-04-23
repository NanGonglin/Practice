package com.testing.reverse;

/**
 * @Classname ReverseString2
 * @Description 类型说明
 * @Date 2021/4/16 14:29
 * @Created by 测试园
 */
public class ReverseString2 {
    public static void main(String[] args) {
        String str="sdwefe";
        String string = reverseString(str);
        System.out.println(string);

    }
    public static String reverseString(String str){
        StringBuffer stringBuffer=new StringBuffer(str);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }
}
