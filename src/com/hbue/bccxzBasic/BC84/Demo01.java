package com.hbue.bccxzBasic.BC84;

import java.util.Scanner;

/*
题目描述
已知一个函数y=f(x)，当x < 0时，y = 1；当x = 0时，y = 0；当x > 0时，y = -1。

输入描述:
一行，输入一个整数x。（-10000<x<10000）
输出描述:
一行，输出y的值。
示例1
输入
复制
10
输出
复制
-1
示例2
输入
复制
-10
输出
复制
1
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        if (x<0){
            System.out.println(1);
        }else if (x==0){
            System.out.println(0);
        }else {
            System.out.println(-1);
        }
    }
}
