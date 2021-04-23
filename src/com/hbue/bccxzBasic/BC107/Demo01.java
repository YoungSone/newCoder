package com.hbue.bccxzBasic.BC107;

import java.util.Scanner;

/*
题目描述
KiKi有一个矩阵，他想知道转置后的矩阵（将矩阵的行列互换得到的新矩阵称为转置矩阵），请编程帮他解答。

输入描述:
第一行包含两个整数n和m，表示一个矩阵包含n行m列，用空格分隔。 (1≤n≤10,1≤m≤10)

从2到n+1行，每行输入m个整数（范围-231~231-1），用空格分隔，共输入n*m个数，表示第一个矩阵中的元素。

输出描述:
输出m行n列，为矩阵转置后的结果。每个数后面有一个空格。
示例1
输入
复制
2 3
1 2 3
4 5 6
输出
复制
1 4
2 5
3 6
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strings=in.nextLine().split("\\s");
        //System.out.println(strings[0]);
        int n=Integer.parseInt(strings[0]);
        int m=Integer.parseInt(strings[1]);
        String[] strs=new String[n];
        for (int i = 0; i < n; i++) {
            strs[i]=in.nextLine();
        }
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                String[] str=strs[i1].split("\\s");
                System.out.print(Integer.parseInt(str[i])+" ");
            }
            System.out.println();
        }


    }
}
