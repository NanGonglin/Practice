package com.testing.disappearedNum;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname _448_FindDisappearedNum2
 * @Description 类型说明
 * @Date 2021/4/12 21:01
 * @Created by 测试园
 */
public class _448_FindDisappearedNum2 {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        for (Integer disappearedNumber : disappearedNumbers) {
            System.out.println(disappearedNumber);
        }
    }
    public  static List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        for (int num : nums) {
            int x=(num-1)%n;
            nums[x]+=n;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=n){
                res.add(i+1);
            }
        }
        return res;
    }
}
