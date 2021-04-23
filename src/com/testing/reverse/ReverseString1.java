package com.testing.reverse;

/**
 * @Classname ReverseString
 * @Description 类型说明
 * @Date 2021/4/16 14:11
 * @Created by 测试园
 */
public class ReverseString1 {
    public static void main(String[] args) {
        String str="sdwefe";
        String string = reverseString(str);
        System.out.println(string);

    }
    public static String reverseString(String str){
        //先将字符串转为数组
        char[] s=str.toCharArray();
        //设置一个空字符串
        String reverse="";
        for(int i=s.length-1;i>=0;i--){
            //拼接数组的每个元素
            reverse+=s[i];
        }
        //返回字符串
        return reverse;
    }
}
