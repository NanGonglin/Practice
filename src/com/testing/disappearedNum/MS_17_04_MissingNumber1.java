package com.testing.disappearedNum;

/**
 * @Classname MS_17_04_MissingNumber1
 * @Description 类型说明
 * @Date 2021/4/12 23:17
 * @Created by 测试园
 */
public class MS_17_04_MissingNumber1 {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*nums[0]+n*(n-1)/2;
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
        }
        return sum;
    }
}
