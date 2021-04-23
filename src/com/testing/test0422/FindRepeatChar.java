package com.testing.test0422;

import java.util.*;

/**
 * @Classname findRepeatChar
 * @Description 类型说明
 * @Date 2021/4/22 15:22
 * @Created by 测试园
 */
public class FindRepeatChar {

    public static void main(String[] args) {
        String  str="asdcscddd";
        System.out.println(findRepeatChar(str));
    }

    public  static Set<Character> findRepeatChar(String str){
        //字符串转为字符数组
        char[] s=str.toCharArray();
        //定义map来存储每个字符和出现的次数
        Map<Character,Integer> map=new HashMap<>() ;
        //遍历数组，
        for(int i=0;i<s.length;i++){
            if(map.containsKey(s[i])){
                //如果已经存在，就给值加1，
                map.put(s[i],map.get(s[i])+1);
            }
            else{
                //如果不存在，就值为1
                map.put(s[i],1);
            }
        }
        //使用集合的方法，获取map的最大值
        Integer max= Collections.max(map.values());
        //定义set存储出现次数最多的字符
        Set<Character> set=new HashSet<>();
        //使用entryset遍历
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            //如果map的值等于最大值，那么将键存到set中
            if(characterIntegerEntry.getValue()==max){
                set.add(characterIntegerEntry.getKey());
            }
        }
        return set;
    }
}
