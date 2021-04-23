package com.hbue.bccxzBasic.BC123;

import java.util.Scanner;

/*
题目描述
小乐乐获得4个最大数，请帮他编程找到最大的数。
输入描述:
一行，4个整数，用空格分开。
输出描述:
一行，一个整数，为输入的4个整数中最大的整数。
示例1
输入
复制
5 8 2 5
输出
复制
8
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strings=in.nextLine().split("\\s");
        int max=0;
        for (String string : strings) {
            if (max<Integer.parseInt(string)){
                max=Integer.parseInt(string);
            }
        }
        System.out.println(max);
    }
}
