package com.hbue.bccxzBasic.BC103;

import java.util.Scanner;

/*
题目描述
KiKi现在得到一个包含n*m个数的整数序列，现在他需要把这n*m个数按顺序规划成一个n行m列的矩阵并输出，请你帮他完成这个任务。
输入描述:
一行，输入两个整数n和m，用空格分隔，第二行包含n*m个整数（范围-231~231-1）。(1≤n≤10, 1≤m≤10)
输出描述:
输出规划后n行m列的矩阵，每个数的后面有一个空格。
示例1
输入
复制
2 3
1 2 3 4 5 6
输出
复制
1 2 3
4 5 6
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] str1=in.nextLine().split("\\s");
        String[] str2=in.nextLine().split("\\s");
        int m=Integer.parseInt(str1[0]);
        int n=Integer.parseInt(str1[1]);
        int[] a=new int[n*m+1];

        for (int i = 0; i < str2.length; i++) {
            a[i+1]=Integer.parseInt(str2[i]);
        }
        for (int i = 1; i < a.length; i++) {
           if (i%n==0){
               System.out.print(a[i]+"\n");
           }else {
               System.out.print(a[i]+" ");
           }
        }
    }
}
