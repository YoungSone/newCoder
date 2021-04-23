package com.hbue.bccxzBasic.BC101;

import java.util.Scanner;

/*
题目描述
输入一个班级5个学生各5科成绩，输出5个学生各5科成绩及总分。

输入描述:
五行，每行输入一个学生各5科成绩（浮点数表示，范围0.0~100.0），用空格分隔。
输出描述:
五行，按照输入顺序每行输出一个学生的5科成绩及总分（小数点保留1位），用空格分隔。
示例1
输入
复制
98.5 96.0 100 99 88
60.5 77 88.5 99 60
80 80.5 89 91 92
93 94 95.5 96 97.5
100 98 88.5 88 78.5
输出
复制
98.5 96.0 100.0 99.0 88.0 481.5
60.5 77.0 88.5 99.0 60.0 385.0
80.0 80.5 89.0 91.0 92.0 432.5
93.0 94.0 95.5 96.0 97.5 476.0
100.0 98.0 88.5 88.0 78.5 453.0
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] str1=in.nextLine().split("\\s");
        String[] str2=in.nextLine().split("\\s");
        String[] str3=in.nextLine().split("\\s");
        String[] str4=in.nextLine().split("\\s");
        String[] str5=in.nextLine().split("\\s");
        double[] a=getScore(str1);
        double[] b=getScore(str2);
        double[] c=getScore(str3);
        double[] d=getScore(str4);
        double[] e=getScore(str5);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%.1f ",a[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < b.length; i++) {
            System.out.printf("%.1f ",b[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < c.length; i++) {
            System.out.printf("%.1f ",c[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < d.length; i++) {
            System.out.printf("%.1f ",d[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < e.length; i++) {
            System.out.printf("%.1f ",e[i]);
        }

    }
    
    public static double[] getScore(String[] str){
        double sum=0;
        double[] score=new double[6];
        for (int i = 0; i < str.length; i++) {
            score[i]=Double.parseDouble(str[i]);
            sum+=score[i];
        }
        score[5]=sum;
        return score;
    }
    
}
