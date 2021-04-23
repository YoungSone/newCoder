package com.hbue.bccxzBasic.BC11;

import java.util.Scanner;

/*
题目描述
依次输入一个学生的学号，以及3科（C语言，数学，英语）成绩，在屏幕上输出该学生的学号，3科成绩。
输入描述:
学号以及3科成绩，学号和成绩之间用英文分号隔开，成绩之间用英文逗号隔开。
输出描述:
学号，3科成绩，输出格式详见输出样例。
示例1
输入
复制
17140216;80.845,90.55,100.00
输出
复制
The each subject score of  No. 17140216 is 80.85, 90.55, 100.00.
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String[] strings=str.split("\\;");
        String[] strings1=strings[1].split("\\,");
        System.out.printf("The each subject score of  No. %s is %.2f, %.2f, %.2f.",strings[0],Float.parseFloat(strings1[0]),Float.parseFloat(strings1[1]),Float.parseFloat(strings1[2]));
    }
}
