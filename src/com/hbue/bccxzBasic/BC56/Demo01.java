package com.hbue.bccxzBasic.BC56;


import java.util.Scanner;

/*
题目描述
KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的线段图案。

输入描述:
多组输入，一个整数（1~100），表示线段长度，即“*”的数量。
输出描述:
针对每行输入，输出占一行，用“*”组成的对应长度的线段。
示例1
输入
复制
10
2
输出
复制
**********
**
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
