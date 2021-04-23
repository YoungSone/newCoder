package com.hbue.bccxzBasic.BC77;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/*
题目描述
有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
输入描述:
第一行输入一个整数(0≤N≤50)。

第二行输入N个升序排列的整数，输入用空格分隔的N个整数。

第三行输入想要进行插入的一个整数。

输出描述:
输出为一行，N+1个有序排列的整数。
示例1
输入
复制
5
1 6 9 22 30
8
输出
复制
1 6 8 9 22 30

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String n=in.nextLine();
        String str=in.nextLine();
        String n1=in.nextLine();
        String[] strings=str.split("\\s");
        int[] num=new int[strings.length+1];
        int a=Integer.parseInt(n1);
        for (int i = 0; i < strings.length; i++) {
            num[i]=Integer.parseInt(strings[i]);
        }
        num[strings.length]=a;
        Arrays.sort(num);
        for (int i : num) {
            System.out.print(i+" ");
        }

    }
}
