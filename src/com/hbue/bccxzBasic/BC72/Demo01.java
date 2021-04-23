package com.hbue.bccxzBasic.BC72;

import java.util.Scanner;

/*
题目描述
从键盘输入5个人的身高（米），求他们的平均身高（米）。

输入描述:
一行，连续输入5个身高（范围0.00~2.00），用空格分隔。
输出描述:
一行，输出平均身高，保留两位小数。
示例1
输入
复制
1.68 1.75 1.82 1.60 1.92
输出
复制
1.75

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double[] nums=new double[5];
        for (int i = 0; i < 5; i++) {
            nums[i]=in.nextDouble();
        }
        double avg=(nums[0]+nums[1]+nums[2]+nums[3]+nums[4])/5;
        System.out.printf("%.2f",avg);
    }
}
