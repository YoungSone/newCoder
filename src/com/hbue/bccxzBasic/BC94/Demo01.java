package com.hbue.bccxzBasic.BC94;

import java.util.Scanner;

/*
题目描述
输入数字N，然后输入N个数，计算这N个数的和。
输入描述:
第一行输入一个整数N(0≤N≤50)，第二行输入用空格分隔的N个整数。
输出描述:
输出为一行，为第二行输入的“N个整数之和”的计算结果。
示例1
输入
复制
5
1 2 3 4 5
输出
复制
15

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String[] strings=in.nextLine().split("\\s");
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=Integer.parseInt(strings[i]);
        }
        System.out.println(sum);
    }
}
