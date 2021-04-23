package com.testing.test0422;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname SingleNumber
 * @Description 类型说明
 * @Date 2021/4/19 11:28
 * @Created by 测试园
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums={1,2,3,4,3,2};
        System.out.println(findSingleNumber(nums));
    }

    public static int findSingleNumber(int[] nums){
        Map<Integer,Boolean> map=new HashMap<>();
        //先将数组全部存到map中，键表示数组的元素，值表示出现的次数，次数初始值为0
        for(int i=0;i<nums.length;i++){
            //判断如果键已经重复出现，那么值加1
            if(map.containsKey(nums[i])){
                map.put(nums[i],false);
            }
            else{
                //存储数组
                map.put(nums[i],true);
            }
        }
        //遍历map的值，如果值等于1，输出这个值。
        for (Integer key : map.keySet()) {
            if(map.get(key)==true){
                return key;
            }
        }
        return -1;
    }
}
