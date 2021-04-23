package com.hbue.bccxzBasic.BC76;

import java.util.Arrays;
import java.util.Scanner;

/*
题目描述
公务员面试现场打分。有7位考官，从键盘输入若干组成绩，每组7个分数（百分制），去掉一个最高分和一个最低分，输出每组的平均成绩。
输入描述:
一行，输入7个整数（0~100），代表7个成绩，用空格分隔。
输出描述:
一行，输出去掉最高分和最低分的平均成绩，小数点后保留2位，每行输出后换行。
示例1
输入
复制
99 45 78 67 72 88 60
输出
复制
73.00
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] score=new int[7];
        while (in.hasNext()){
            for (int i = 0; i <7 ; i++) {
                score[i]=in.nextInt();
            }
            Arrays.sort(score);
            int sum=0;
            for (int i = 1; i < score.length-1; i++) {
                sum+=score[i];
            }
            System.out.printf("%.2f",sum/5.0);
        }
    }
}
