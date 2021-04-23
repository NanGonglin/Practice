package com.testing.findRepeatNum;

/**
 * @Classname JZ03_FindRepeatNum2
 * @Description 类型说明
 * @Date 2021/4/12 16:08
 * @Created by 测试园
 */
public class JZ03_FindRepeatNum3 {
    public int findRepeatNumber(int[] nums){
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                int temp;
                temp=nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=temp;
            }
        }
        return -1;
    }
}
