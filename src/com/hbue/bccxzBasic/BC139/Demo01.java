package com.hbue.bccxzBasic.BC139;

import java.util.Scanner;

/*
题目描述
KiKi学习了面向对象技术，学会了通过封装属性（变量）和行为（函数）定义类，现在他要设计一个电子日历类TDate。
它有3个私有数据成员：Month,Day,Year和若干个公有成员函数，要求：
（1）带有默认形参值的构造函数，默认值为0, 0, 0；
（2）输出日期函数，用“日/月/年”格式输出日期；
（3）设置日期函数，从键盘输入年、月、日。
输入描述:
一行，三个整数，用空格分隔，分别表示年、月、日。
输出描述:
一行，用“日/月/年”格式输出日期。
示例1
输入
复制
2019 12 30
输出
复制
30/12/2019

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a=new int[3];
        for (int i = 0; i <3 ; i++) {
            a[i]=in.nextInt();
        }
        TDate date=new TDate(a[0],a[1],a[2]);
    }
}
class TDate{
    private int year=0;
    private int month=0;
    private int day=0;

    public TDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println(day+"/"+month+"/"+year);
    }
}
