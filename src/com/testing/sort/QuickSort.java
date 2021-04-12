package com.testing.sort;

/**
 * @Classname QuickSort
 * @Description 类型说明
 * @Date 2021/4/5 21:33
 * @Created by 测试园
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] num = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        quick(num, 0, num.length - 1);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
    public static int[] quick(int[] num,int low,int high){
        int left=low;
        int right=high;
        int base=num[left];
        while(left<right){
            while (left<right){
                if(num[right]>base){
                    right--;
                }
                else {
                    int temp;
                    temp=num[right];
                    num[right]=base;
                    num[left]=temp;
                    left++;
                    break;
                }
            }
            while(left<right){
                if(num[left]<base){
                    left++;
                }
                else{
                    int temp;
                    temp=num[left];
                    num[left]=base;
                    num[right]=temp;
                    right--;
                    break;
                }
            }
        }
        if(left-1>low){
            quick(num,low,left-1);
        }
        if(right+1<high){
            quick(num,right+1,high);
        }
        return num;
    }


}

