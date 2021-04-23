package com.hbue.bccxzBasic.BC91;

import java.util.Scanner;

/*
题目描述
输入10科成绩，换行显示输入的10科成绩。
输入描述:
一行，输入10科成绩（整数表示，范围0~100），用空格分隔。
输出描述:
一行，输出输入的10科成绩，用空格分隔。
示例1
输入
复制
98 100 99 97 95 99 98 97 96 100
输出
复制
98 100 99 97 95 99 98 97 96 100
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] score=new int[10];
        for (int i = 0; i < 10; i++) {
            score[i]=in.nextInt();
        }
        for (int i : score) {
            System.out.print(i+" ");
        }
    }
}
