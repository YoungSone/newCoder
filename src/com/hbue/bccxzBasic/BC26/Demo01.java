package com.hbue.bccxzBasic.BC26;

import java.util.Scanner;

/*
题目描述
根据给出的三角形3条边a, b, c（0 < a, b, c < 100,000），计算三角形的周长和面积。
输入描述:
一行，三角形3条边（能构成三角形），中间用一个空格隔开。
输出描述:
一行，三角形周长和面积（保留两位小数），中间用一个空格隔开，输出具体格式详见输出样例。
示例1
输入
复制
3 3 3
输出
复制
circumference=9.00 area=3.90
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double[] nums=new double[3];
        for (int i = 0; i < 3; i++) {
            nums[i]=in.nextDouble();
        }

        double circumference=nums[0]+nums[1]+nums[2];
        double heron=circumference/2;
        double area=Math.sqrt(heron*(heron-nums[0])*(heron-nums[1])*(heron-nums[2]));
        System.out.printf("circumference=%.2f area=%.2f",circumference,area);
    }
}
