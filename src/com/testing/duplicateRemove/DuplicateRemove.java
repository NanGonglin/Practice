package com.testing.duplicateRemove;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname DuplicateRemove
 * @Description 类型说明
 * @Date 2021/4/15 10:15
 * @Created by 测试园
 */
public class DuplicateRemove {


    public static void main(String[] args) {
        int[] nums={2,4,5,6,5,7,7,9};
        Object[] nums2 = remove(nums);
        for (Object o : nums2) {
            System.out.print(o+" ");
        }

    }

    public static Object[] remove(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        return set.toArray();
    }
}
