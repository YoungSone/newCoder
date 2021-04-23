package com.hbue.bccxzBasic.BC79;

import java.util.Scanner;

/*
题目描述
给出两幅相同大小的黑白图像（用0-1矩阵）表示，求它们的相似度。若两幅图像在相同位置上的像素点颜色相同，则称它们在该位置具有相同的像素点。两幅图像的相似度定义为相同像素点数占总像素点数的百分比。

输入描述:
第一行包含两个整数m和n，表示图像的行数和列数，用单个空格隔开。1≤m≤100, 1≤n≤100。之后m行，每行n个整数0或1，表示第一幅黑白图像上各像素点的颜色，相邻两个数用单个空格隔开。之后m行，每行n个整数0或1，表示第二幅黑白图像上各像素点的颜色，相邻两个数用单个空格隔开。
输出描述:
一个实数，表示相似度(以百分比的形式给出)，精确到小数点后两位。
示例1
输入
复制
3 3
1 0 1
0 0 1
1 1 0
1 1 0
0 0 1
0 0 1
输出
复制
44.44
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strings=in.nextLine().split("\\s");
        int n=Integer.parseInt(strings[1]);
        String str1="";
        String str2="";
        for (int i = 1; i <=n; i++) {
            str1=str1+in.nextLine()+" ";
        }
        for (int i = 1; i <= n; i++) {
            str2=str2+in.nextLine()+" ";
        }
        int count=0;
        String[] str1s=str1.split("\\s");
        String[] str2s=str2.split("\\s");
        for (int i = 0; i < str1s.length; i++) {
            if (str1s[i].equals(str2s[i])){
                    count++;
            }
        }
        System.out.printf("%.2f\n",100*count/1.0/n/n);
    }
}
