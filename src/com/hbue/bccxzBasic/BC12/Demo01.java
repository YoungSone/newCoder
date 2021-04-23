package com.hbue.bccxzBasic.BC12;

import java.util.Scanner;

/*
题目描述
输入一个字符，用它构造一个三角形金字塔。
输入描述:
输入只有一行，一个字符。
输出描述:
该字符构成的三角形金字塔。
示例1
输入
复制
1
输出
复制
    1
   1 1
  1 1 1
 1 1 1 1
1 1 1 1 1

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k >i ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(str);
                if (j==i){
                    System.out.print("\n");
                }else {
                    System.out.print(" ");
                }

            }
        }
    }
}
