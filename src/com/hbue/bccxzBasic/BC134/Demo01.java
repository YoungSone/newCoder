package com.hbue.bccxzBasic.BC134;

import java.util.Scanner;

/*
题目描述
KiKi知道了大一三科比较重要课程的分数，包括：程序设计基础，高数，英语，请编程帮他找到三科中的最高分。
输入描述:
一行，三个整数，用空格分隔，代表三科成绩。
输出描述:
一行，一个整数，代表输入三科分数中的最高分数。
示例1
输入
复制
90 88 99
输出
复制
99
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strings=in.nextLine().split("\\s");
        int max=0;
        for (int i = 0; i < strings.length; i++) {
            if (max<=Integer.parseInt(strings[i])){
                max=Integer.parseInt(strings[i]);
            }
        }
        System.out.println(max);
    }
}
