package com.hbue.bccxzBasic.BC132;

import java.util.Scanner;

/*
题目描述
KiKi这学期努力学习程序设计基础，要期末考试了，BoBo老师告诉他，总成绩包括四个部分，如下：
总成绩 = 实验成绩 * 20% + 课堂表现成绩 * 10% + 过程考核成绩 * 20% + 期末上机考试成绩 * 50%，现在输入KiKi的各项成绩，请计算KiKi的总成绩。
输入描述:
一行，包括四个整数（百分制），用空格分隔，分别表示实验成绩，课堂表现成绩，过程考核成绩，期末上机考试成绩。
输出描述:
一行，总成绩，保留小数点一位。
示例1
输入
复制
100 100 90 80
输出
复制
88.0
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] str1=in.nextLine().split("\\s");
        int[] a=new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            a[i]=Integer.parseInt(str1[i]);
        }
        double avg=a[0]*0.2+a[1]*0.1+a[2]*0.2+a[3]*0.5;
        System.out.printf("%.1f",avg);
    }
}
