package com.hbue.bccxzBasic.BC18;

import java.util.Scanner;

/*
题目描述
给定两个整数a和b (－10,000 < a,b < 10,000)，计算a除以b的整数商和余数。
输入描述:
一行，包括两个整数a和b，依次为被除数和除数（不为零），中间用空格隔开。
输出描述:
一行，包含两个整数，依次为整数商和余数，中间用一个空格隔开。
示例1
输入
复制
15 2
输出
复制
7 1
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(a/b+" "+a%b);
    }
}
