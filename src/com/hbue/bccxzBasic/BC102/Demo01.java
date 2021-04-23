package com.hbue.bccxzBasic.BC102;

import java.util.Scanner;
/*
题目描述
KiKi得到了一个n行m列的矩阵，现在他想知道第x行第y列的值是多少，请你帮助他完成这个任务。

输入描述:
第一行包含两个数n和m，表示这个矩阵包含n行m列。从2到n+1行，每行输入m个整数（范围-231~231-1），用空格分隔，共输入n*m个数，表示矩阵中的元素。接下来一行输入x和y，用空格分隔，表示KiKi想得到的元素的位置。(1≤x≤n≤10，1≤y≤m≤10)

输出描述:
一行，输出一个整数值，为KiKi想知道的值。
示例1
输入
复制
2 3
1 2 3
4 5 6
1 2
输出
复制
2
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] str1=in.nextLine().split("\\s");
        String str="";
        for (int i = 0; i <Integer.parseInt(str1[0]) ; i++) {
            str+=in.nextLine()+" ";
        }
        String[] strings=str.split("\\s");
        String[] str2=in.nextLine().split("\\s");
        int m=Integer.parseInt(str2[0]);
        int n=Integer.parseInt(str2[1]);
        for (int i = 0; i <strings.length; i++) {
            if (i==(Integer.parseInt(str1[1])*(m-1)+n-1)){
                System.out.println(strings[i]);
            }
        }
    }
}
