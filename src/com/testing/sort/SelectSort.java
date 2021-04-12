package com.testing.sort;

/**
 * @Classname SelectSort
 * @Description 类型说明
 * @Date 2021/4/5 21:19
 * @Created by 测试园
 */
public class SelectSort {
    public static void main(String[] args) {
//        int[] num = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] num = {50, 48, 47, 46, 44, 38, 36, 27, 26, 19, 15, 5, 4, 3, 2};
        select(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    public static int[] select(int[] num){
        int minindex;
        int temp;
        for(int i=0;i<num.length-1;i++){
            minindex=i;
            for(int j=i;j<num.length;j++){
                if(num[minindex]>num[j]){
                    minindex=j;
                }
            }
            if(minindex!=i){
                temp=num[i];
                num[i]=num[minindex];
                num[minindex]=temp;
            }
        }
        return num;
    }

}

