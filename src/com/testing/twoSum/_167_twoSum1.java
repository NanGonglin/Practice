package com.testing.twoSum;

/**
 * @Classname _167_twoSum
 * @Description 类型说明
 * @Date 2021/4/12 14:54
 * @Created by 测试园
 */
public class _167_twoSum {
    public static void main(String[] args) {
        int[] nums1={5,25,75};
        nums1=twoSum(nums1, 100);
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int x=numbers[i];
            int index=binarySearch(numbers,i+1,numbers.length-1,target-x);
            if(index!=-1){
                return new int[]{i+1,index+1};
            }
        }
        return new int[0];
    }
    public static int binarySearch(int[] nums,int left,int right,int target){

        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
