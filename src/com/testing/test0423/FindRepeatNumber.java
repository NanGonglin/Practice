package com.testing.test0423;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname FindRepeatNumber
 * @Description 类型说明
 * @Date 2021/4/23 15:22
 * @Created by 测试园
 */
public class FindRepeatNumber {
    public static void main(String[] args) {
        int[] nums={2,3,5,7,3,1,2};
        Map<Integer, Integer> repeatNumber = findRepeatNumber(nums);
        for (Integer integer : repeatNumber.keySet()) {
            System.out.println(integer+""+repeatNumber.get(integer));
        }
    }

    public  static Map<Integer,Integer> findRepeatNumber(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        return map;
    }
}
