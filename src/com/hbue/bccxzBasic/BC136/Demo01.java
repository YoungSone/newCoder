package com.hbue.bccxzBasic.BC136;

import java.util.Scanner;

/*
题目描述
给定一个整数序列，KiKi想把其中的重复的整数去掉，并将去重后的序列从小到达排序输出。
输入描述:
第一行，输入一个整数n，表示序列有n个整数。
第二行输入n个整数（每个整数大于等于1，小于等于1000），整数之间用空格分隔。
输出描述:
去重并且从小到大排列的整数序列，整数之间用空格分隔。
示例1
输入
复制
6
5 3 3 4 2 2
输出
复制
2 3 4 5
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        int[] a=new int[1001];
        for (int i = 0; i < n; i++) {
            a[in.nextInt()]++;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]>0){
                System.out.print(i+" ");
            }
        }

    }
}
