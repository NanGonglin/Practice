package com.testing.disappearedNum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Classname _448_FindDisappearedNum1
 * @Description 类型说明
 * @Date 2021/4/12 18:03
 * @Created by 测试园
 */
public class _448_FindDisappearedNum1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]);
        }
        for(int j=0;j<nums.length;j++){
            if(!set.contains(j)){
                list.add(j);
            }
        }
        return list;
    }
}

