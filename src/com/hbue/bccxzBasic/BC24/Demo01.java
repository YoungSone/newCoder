package com.hbue.bccxzBasic.BC24;

import java.util.Scanner;

/*
题目描述
依次输入一个学生的3科成绩，在屏幕上输出该学生的总成绩以及平均成绩。
输入描述:
一行，3科成绩，成绩之间用一个空格隔开。
输出描述:
一行，总成绩和平均成绩（小数点后保留两位），用一个空格隔开。
示例1
输入
复制
79.5 80.0 98.0
输出
复制
257.50 85.83
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float[] scores=new float[3];
        for (int i = 0; i < 3; i++) {
            scores[i]=in.nextFloat();
        }
        float sum=scores[0]+scores[1]+scores[2];
        float avg=sum/3;
        System.out.printf("%.2f %.2f",sum,avg);
    }

}
