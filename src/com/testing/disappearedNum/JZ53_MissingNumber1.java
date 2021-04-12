package com.testing.disappearedNum;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname JZ53_MissingNumber1
 * @Description 类型说明
 * @Date 2021/4/12 22:15
 * @Created by 测试园
 */
public class JZ53_MissingNumber1 {
    public int missingNumber(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==mid){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left;
    }
}
