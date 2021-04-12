package com.testing.repeatNum;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname _287_FindDuplicate
 * @Description 类型说明
 * @Date 2021/4/12 17:37
 * @Created by 测试园
 */
public class _287_FindDuplicate1 {
    public int findDuplicate(int[] nums) {
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
