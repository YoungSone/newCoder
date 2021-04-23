package com.hbue.bccxzBasic.BC95;

import java.util.Arrays;
import java.util.Scanner;

/*
题目描述
输入n个成绩，换行输出n个成绩中最高分数和最低分数的差。
输入描述:
两行，第一行为n，表示n个成绩，不会大于10000。

第二行为n个成绩（整数表示，范围0~100），以空格隔开。
输出描述:
一行，输出n个成绩中最高分数和最低分数的差。
示例1
输入
复制
10
98 100 99 97 95 99 98 97 96 100
输出
复制
5
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=Integer.parseInt(in.nextLine());
        String[] strings=in.nextLine().split("\\s");
        int[] score=new int[a];
        for (int i = 0; i < a; i++) {
            score[i]=Integer.parseInt(strings[i]);
        }
        Arrays.sort(score);
        System.out.println(score[a-1]-score[0]);
    }
}
