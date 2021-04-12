package com.testing.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname _1_TwoSum2
 * @Description 类型说明
 * @Date 2021/4/12 15:38
 * @Created by 测试园
 */
public class _1_TwoSum2 {
    //解法二：使用HashMap查找
    public static int[] twoSum2(int[] nums, int target){
        if(nums==null||nums.length==0){
            return new int[0];
        }
        //使用hashmap存储要找的数和对应下标值
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //设置第一个数的值
            int x=nums[i];
            //如果在map中存在一个数，它的值等于目标值减去第一个数的值
            if(map.containsKey(target-x)){
                //将这个数的下标值存下来
                int index=map.get(target-x);
                //返回这两个数的下标值
                return new int[]{i,index};
            }
            //如果没有找到就将第一个数和下标值存储到map中，将数作为键，下标值作为值。
            map.put(x, i);
        }
        return new int[0];
    }
}
