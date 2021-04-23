package com.hbue.bccxzBasic.BC33;

import java.util.Scanner;

/*
    题目描述
从键盘输入5个学生的成绩（整数），求他们的平均成绩（浮点数，保留一位小数）。

输入描述:
一行，连续输入5个整数（范围0~100），用空格分隔。
输出描述:
一行，输出5个数的平均数（保留一位小数）。
示例1
输入
复制
75 80 43 67 96
输出
复制
72.2

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        for (int i = 0; i < 5; i++) {
            sum+=in.nextInt();
        }

        double avg=sum/5.0;
        System.out.printf("%.1f",avg);
    }
}
