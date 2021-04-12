package com.testing.search;

import com.sun.media.jfxmediaimpl.HostUtils;

/**
 * @Classname binarySearch
 * @Description 类型说明
 * @Date 2021/4/9 23:18
 * @Created by 测试园
 */
public class binarySearch {
    public static void main(String[] args) {
        int[] nums={2,3,4,5,6,7,8,9,10};
        int toFind=9;
        int index = binarySearch(nums,0,nums.length-1, toFind);
        System.out.println(index);
    }


    /**
     * 查找数组中指定元素
     * 二分查找思想：也称为折半查找，先找到中间的数，将中间数与要查找的数进行比较，如果比较的值相等，那么就返回中间的这个数
     * 如果比较结果是查找的数大，那么从右边继续一分为二查找，
     * 反之，从左边继续一分为二查找
     * @param nums 数组
     * @param toFind 要查找的数
     * @return
     */
    public static int binarySearch(int[] nums, int left,int right,int toFind){
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==toFind){
                return mid;
            }
            else if(nums[mid]<toFind){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
