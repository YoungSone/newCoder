package com.hbue.bccxzBasic.BC62;

import java.util.Scanner;

/*
题目描述
KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的翻转金字塔图案。
输入描述:
多组输入，一个整数（2~20），表示翻转金字塔边的长度，即“*”的数量，也表示输出行数。
输出描述:
针对每行输入，输出用“*”组成的金字塔，每个“*”后面有一个空格。
示例1
输入
复制
5
输出
复制
* * * * *
 * * * *
  * * *
   * *
    *
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            for (int i = n; i >=1; i--) {
                for (int j = 1; j <=n-i ; j++) {
                    System.out.print(" ");
                }
                for (int i1 = 1; i1 <= i; i1++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }
    }
}
