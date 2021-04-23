package com.hbue.bccxzBasic.BC104;

import java.util.Scanner;

/*
题目描述
KiKi想从n行m列的方阵队列中找到身高最高的人的位置，请你帮助他完成这个任务。

输入描述:
第一行包含两个整数n和m，表示这个方阵队列包含n行m列。从2到n+1行，每行输入m个整数（范围-231~231-1），用空格分隔，共输入n*m个数，表示方阵中的所有人的身高（保证输入身高都不相同）。(1≤x≤n≤10，1≤y≤m≤10)

输出描述:
一行，输出两个整数，用空格分隔，表示方阵中身高最高的人所在的行号和列号。
示例1
输入
复制
2 2
175 180
176 185
输出
复制
2 2

第i行 第j 个为
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strings=in.nextLine().split("\\s");
        int n=Integer.parseInt(strings[0]);
        int m=Integer.parseInt(strings[1]);
        String str="";
        for (int i = 0; i < n; i++) {
            str+=in.nextLine()+" ";
        }
        String[] strs=str.split("\\s");
        int[] a=new int[strs.length+1];
        for (int i = 0; i < strs.length; i++) {
            a[i+1]=Integer.parseInt(strs[i]);
        }
        int max=a[1];
        int flag=0;
        for (int i = 1; i < a.length; i++) {
            if (max<=a[i]){
                max=a[i];
                flag=i;
            }
        }
        if (flag/m==0){
            System.out.println(0+" "+flag);
        }else if (flag%m==0){
            System.out.println(flag/m+" "+m);
        }else {
            System.out.println((flag/m+1)+" "+flag%m);
        }

    }

}
