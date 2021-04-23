package com.hbue.bccxzBasic.BC27;

import java.util.Scanner;

/*
题目描述
给定一个球体的半径，计算其体积。其中球体体积公式为 V = 4/3*πr3，其中 π= 3.1415926。
输入描述:
一行，用浮点数表示的球体的半径。
输出描述:
一行，球体的体积，小数点后保留3位。
示例1
输入
复制
3.0
输出
复制
113.097

 */
public class Demo01 {
    final static double PI=3.1415926;
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        double r=in.nextDouble();
        double v=(4/3.0)*PI*r*r*r;
        System.out.printf("%.3f",v);
    }
}
