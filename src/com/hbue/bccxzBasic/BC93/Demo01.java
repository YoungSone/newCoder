package com.hbue.bccxzBasic.BC93;

import java.util.Scanner;

/*
题目描述
输入10个整数，分别统计输出正数、负数的个数。
输入描述:
输入10个整数（范围-231~231-1），用空格分隔。
输出描述:
两行，第一行正数个数，第二行负数个数，具体格式见样例。
示例1
输入
复制
-1 2 3 -6 7 8 -1 6 8 10
输出
复制
positive:7
negative:3
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] nums=new int[10];
        int znum=0;
        int fnum=0;
        for (int i = 0; i < nums.length; i++) {
            nums[i]=in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                znum++;
            }else {
                fnum++;
            }
        }
        System.out.println("positive:"+znum);
        System.out.println("negative:"+fnum);
    }
}
