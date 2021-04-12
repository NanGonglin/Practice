package com.testing.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname twoSum
 * @Description 类型说明
 * @Date 2021/4/12 12:13
 * @Created by 测试园
 */
public class _1_TwoSum1 {
    public static void main(String[] args) {
        int[] nums1=null;
        nums1=twoSum1(nums1, 3);
        for(int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }
    //给定一个数组和一个数，已知这个数组中存在两个数加起来的和等于目标数，要求找到这两个数，输出下标值

    //解法一：暴力解法，线性查找
    public static int[] twoSum1(int[] nums, int target){
        //先对数组做判空处理，若数组为空或者数组的长度为0，那么返回空数组
        if(nums==null||nums.length==0){
            return new int[0];
        }
        for(int i=0;i<nums.length;i++){
            //设置第一个数的下标为x,
            int x=i;
            //设置第二个数的下标为j,
            for(int j=i+1;j<nums.length;j++){
                //如果有数等于目标值减去第一个数的值，那么返回数组的下标值
                if(nums[j]==target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

}
