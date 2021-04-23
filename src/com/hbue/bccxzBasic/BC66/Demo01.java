package com.hbue.bccxzBasic.BC66;

import java.util.Scanner;

/*
题目描述
KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的反斜线形图案。
输入描述:
多组输入，一个整数（2~20），表示输出的行数，也表示组成反斜线的“*”的数量。

输出描述:
针对每行输入，输出用“*”组成的反斜线。
示例1
输入
复制
4
输出
复制
*
 *
  *
   *
示例2
输入
复制
5
输出
复制
*
 *
  *
   *
    *
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            for (int i = 1; i <= n; i++) {

                for (int i1 = 1; i1 <= i-1; i1++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 1; j <=n-i; j++) {
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
    }
}
