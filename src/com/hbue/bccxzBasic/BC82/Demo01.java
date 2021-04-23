package com.hbue.bccxzBasic.BC82;

import java.util.Scanner;

/*
题目描述
这是一个非常简单的题目，意在考察你编程的基础能力。千万别想难了哦。输入为一行，包括了用空格分隔的四个整数a、b、c、d（0 < a, b, c, d < 100,000）。输出为一行，为“(a+b-c)*d”的计算结果。

输入描述:
输入为一行，用空格分隔的四个整数a、b、c、d（0 < a, b, c, d < 100,000）。
输出描述:
输出为一行，为“(a+b-c)*d”的计算结果。
示例1
输入
复制
1 3 2 4
输出
复制
8
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] nums=new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println((nums[0]+nums[1]-nums[2])*nums[3]);
    }
}
