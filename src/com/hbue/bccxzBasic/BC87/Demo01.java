package com.hbue.bccxzBasic.BC87;

import java.util.Arrays;
import java.util.Scanner;

/*
题目描述
输入n科成绩（浮点数表示），统计其中的最高分，最低分以及平均分。

输入描述:
两行，

第1行，正整数n（1≤n≤100）

第2行，n科成绩（范围0.0~100.0），用空格分隔。
输出描述:
输出一行，三个浮点数，分别表示，最高分，最低分以及平均分（小数点后保留2位），用空格分隔。
示例1
输入
复制
5
99.5 100.0 22.0 60.0 88.5
输出
复制
100.00 22.00 74.00
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String str=in.nextLine();
        String[] strings=str.split("\\s");
        double[] score=new double[n];
        for (int i = 0; i < score.length; i++) {
            score[i]=Double.parseDouble(strings[i]);
        }
        double sum=0.0;
        for (int i = 0; i < score.length; i++) {
            sum+=score[i];
        }
        Arrays.sort(score);
        System.out.printf("%.2f %.2f %.2f",score[n-1],score[0],(sum/n));

    }

}
