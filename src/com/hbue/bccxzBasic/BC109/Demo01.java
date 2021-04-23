package com.hbue.bccxzBasic.BC109;

import java.util.Scanner;

/*
题目描述
KiKi知道什么叫杨辉三角之后对杨辉三角产生了浓厚的兴趣，他想知道杨辉三角的前n行，请编程帮他解答。杨辉三角，本质上是二项式(a+b)的n次方展开后各项的系数排成的三角形。其性质包括：每行的端点数为1， 一个数也为1；每个数等于它左上方和上方的两数之和。

输入描述:
第一行包含一个整数数n。 (1≤n≤30)
输出描述:
包含n行，为杨辉三角的前n行，每个数输出域宽为5。

示例1
输入
复制
6
输出
复制
    1
    1    1
    1    2    1
    1    3    3    1
    1    4    6    4    1
    1    5   10   10    5    1
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.printf("%5d",PaTriangle(i,i1));
            }
            System.out.println();
        }
    }
    public static int PaTriangle(int n,int i){
        int num=0;
        if (n==1||i==1){
            return 1;
        }else if (n==i){
            return 1;
        }
        else {
            return PaTriangle(n-1,i)+PaTriangle(n-1,i-1);
        }

    }
}
