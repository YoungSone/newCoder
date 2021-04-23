package com.hbue.bccxzBasic.BC108;

import java.util.Scanner;

/*
题目描述
KiKi有一个矩阵，他想知道经过k次行变换或列变换后得到的矩阵。请编程帮他解答。

输入描述:
第一行包含两个整数n和m，表示一个矩阵包含n行m列，用空格分隔。 (1≤n≤10,1≤m≤10)

从2到n+1行，每行输入m个整数（范围-231~231-1），用空格分隔，共输入n*m个数，表示第一个矩阵中的元素。
接下来一行输入k，表示要执行k次操作（1≤k≤5）。接下来有k行，每行包括一个字符t和两个数a和b，中间用空格格分隔，t代表需要执行的操作，当t为字符'r'时代表进行行变换，当t为字符'c'时代表进行列变换，a和b为需要互换的行或列（1≤a≤b≤n≤10，1≤a≤b≤m≤10）。


输出描述:
输出n行m列，为矩阵交换后的结果。每个数后面有一个空格。
示例1
输入
复制
2 2
1 2
3 4
1
r 1 2
输出
复制
3 4
1 2
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strings=in.nextLine().split("\\s");
        int n=Integer.parseInt(strings[0]);
        int m=Integer.parseInt(strings[1]);
        int[][] a=new int[n][m];
        String[] str=new String[n];
        for (int i = 0; i < n; i++) {
            str[i]=in.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String[] strs=str[i].split("\\s");
            for (int i1 = 0; i1 < m; i1++) {
                a[i][i1]=Integer.parseInt(strs[i1]);
            }
        }
        int k=Integer.parseInt(in.nextLine());
        String[] str1=new String[k];
        for (int i = 0; i < k; i++) {
            str1[i]=in.nextLine();
        }
        //循环交互次数
        for (int i = 0; i < k; i++) {
            String[] str2=str1[i].split("\\s");
            //数组中表示的是 0 1 实际上是 1 2
            int b=Integer.parseInt(str2[1])-1;
            int c=Integer.parseInt(str2[2])-1;
            switch (str2[0]){
                //行变换
                case "r":
                    for (int i1 = 0; i1 < m; i1++) {
                        int temp=a[b][i1];
                        a[b][i1]=a[c][i1];
                        a[c][i1]=temp;
                    }
                    break;
                case "c":
                    for (int i1 = 0; i1 < n; i1++) {
                        int temp=a[i1][b];
                        a[i1][b]=a[i1][c];
                        a[i1][c]=temp;
                    }
                    break;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                System.out.print(a[i][i1]+" ");
            }
            System.out.println();
        }
    }
}
