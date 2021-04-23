package com.hbue.bccxzBasic.BC100;

import java.util.Arrays;
import java.util.Scanner;

/*
题目描述
输入两个升序排列的序列，将两个序列合并为一个有序序列并输出。
输入描述:
输入包含三行，

第一行包含两个正整数n, m（1 ≤ n,m ≤ 100），用空格分隔。n表示第二行第一个升序序列中数字的个数，m表示第三行第二个升序序列中数字的个数。

第二行包含n个整数（范围1~5000），用空格分隔。

第三行包含m个整数（范围1~5000），用空格分隔。
输出描述:
输出为一行，输出长度为n+m的升序序列，即长度为n的升序序列和长度为m的升序序列中的元素重新进行升序序列排列合并。
示例1
输入
复制
5 6
1 3 7 9 22
2 8 10 17 33 44
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] str=in.nextLine().split("\\s");
        String str1=in.nextLine();
        String str2=in.nextLine();
        String str3=str1+" "+str2;
        String[] strings=str3.split("\\s");
        int[] a=new int[Integer.parseInt(str[1])+Integer.parseInt(str[0])];
        for (int i = 0; i < a.length; i++) {
            a[i]=Integer.parseInt(strings[i]);
        }
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
