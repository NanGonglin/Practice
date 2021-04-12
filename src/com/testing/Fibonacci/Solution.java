package com.testing.Fibonacci;

import java.util.Scanner;

/**
 * @Classname Solution
 * @Description 类型说明
 * @Date 2021/4/5 17:46
 * @Created by 测试园
 */
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = fib(n);
        System.out.println("第" + n + "个斐波那契数是" + result);
    }

    public static int fib(int n){
        if(n<2){
            return n;
        }
        int p=0,q=0,r=1;
        for(int i=2;i<=n;i++){
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }


}

