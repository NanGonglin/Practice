package com.testing.findRepeatNum;

/**
 * @Classname JZ03_FindRepeatNum1
 * @Description 类型说明
 * @Date 2021/4/12 16:12
 * @Created by 测试园
 */
public class JZ03_FindRepeatNum1 {
    public int findRepeatNumber(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
