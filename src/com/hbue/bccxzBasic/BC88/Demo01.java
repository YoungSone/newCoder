package com.hbue.bccxzBasic.BC88;

import java.util.Arrays;
import java.util.Scanner;

/*
题目描述

有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。



输入描述:
共三行，
第一行输入一个整数(0≤N≤50)。
第二行输入N个升序排列的整数，输入用空格分隔的N个整数。
第三行输入想要进行插入的一个整数。
输出描述:
输出为一行，N+1个有序排列的整数。
示例1
输入
复制
7
5 30 40 50 60 70 90
20
输出
复制
5 20 30 40 50 60 70 90

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String[] strings=in.nextLine().split("\\s");
        int k=Integer.parseInt(in.nextLine());
        int[] nums=new int[n+1];
        for (int i = 0; i < strings.length; i++) {
            nums[i]=Integer.parseInt(strings[i]);
        }
        nums[n]=k;
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
