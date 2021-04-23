package com.hbue.bccxzBasic.BC130;

import java.util.Scanner;

/*
题目描述
给定n个整数和一个整数x，小乐乐想从n个整数中判断x出现几次，请编程帮他实现。
输入描述:
共3行
第一行，一个整数，表示n（1 <= n <= 100）。
第二行，共输入n个整数，两个整数之间用空格分隔。
第三行，输入一个整数，表示要查找的整数x。
输出描述:
一行，表示整数x出现的次数。
示例1
输入
复制
5
1 1 2 1 3
1
输出
复制
3
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String[] str1=in.nextLine().split("\\s");
        int x=Integer.parseInt(in.nextLine());
        int[] a=new int[101];
        for (int i = 0; i < str1.length; i++) {
            a[Integer.parseInt(str1[i])]++;
        }
        System.out.println(a[x]);
    }
}
