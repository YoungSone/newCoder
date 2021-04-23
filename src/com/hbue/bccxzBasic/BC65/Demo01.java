package com.hbue.bccxzBasic.BC65;

import java.util.Scanner;

/*
题目描述
KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的箭形图案。
输入描述:
多组输入，一个整数（2~20）。
输出描述:
针对每行输入，输出用“*”组成的箭形。

示例1
输入
复制
2
输出
复制
    *
  **
***
  **
    *
示例2
输入
复制
3
输出
复制
      *
    **
  ***
****
  ***
    **
      *
示例3
输入
复制
4
输出
复制
        *
      **
    ***
  ****
*****
  ****
    ***
      **
        *
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            for (int i = 1; i <=2*n+1 ; i++) {
                if (i<=n){
                    for (int j = 1; j <=(n-i+1)*2 ; j++) {
                        System.out.print(" ");
                    }
                    for (int i1 = 1; i1 <= i; i1++) {
                        System.out.print("*");
                    }
                }else if (i>n){
                    //kong = i-n-1 *2
                    for (int j = 1; j<=(i-n-1)*2 ; j++) {
                        System.out.print(" ");
                    }
                    // xing = i-kong
                    for (int j = 1; j <=i-(i-n-1)*2; j++) {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");

            }
        }
    }
}
