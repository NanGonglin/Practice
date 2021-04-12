package com.testing.sort;

/**
 * @Classname BubbleSort
 * @Description 类型说明
 * @Date 2021/4/5 21:05
 * @Created by 测试园
 */
public class BubbleSort {
    public static void main(String[] args) {
//        int[] num = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] num = {50, 48, 47, 46, 44, 38, 36, 27, 26, 19, 15, 5, 4, 3, 2};
        bubbleSort(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    //    public static int[] bubbleSort(int[] num){
//        int temp;
//        for(int i=1;i<num.length;i++){
//            for(int j=0;j<num.length-i;j++){
//                if(num[j]>num[j+1]){
//                    temp=num[j+1];
//                    num[j+1]=num[j];
//                    num[j]=temp;
//                }
//            }
//        }
//
//        return num;
//    }
    public static int[] bubbleSort(int[] nums) {
        int temp;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
