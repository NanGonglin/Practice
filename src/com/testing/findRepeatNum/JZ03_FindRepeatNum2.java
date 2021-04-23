package com.testing.repeatNum;

import java.util.*;

/**
 * @Classname RepeatNum
 * @Description 类型说明
 * @Date 2021/4/4 23:59
 * @Created by 测试园
 */
public class JZ03_FindRepeatNum2 {
    //在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
    // 请找出数组中任意一个重复的数字
    int[] num = {2, 3, 1, 0, 2, 5, 3};

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 15};
        System.out.println(findRepeatNumber(nums));
    }

    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }
}
