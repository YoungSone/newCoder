package com.hbue.bccxzBasic.BC92;

import java.util.Scanner;

/*
题目描述
输入10个整数，要求按输入时的逆序把这10个数打印出来。逆序输出，就是按照输入相反的顺序打印这10个数。
输入描述:
一行，输入10个整数（范围-231~231-1），用空格分隔。
输出描述:
一行，逆序输出输入的10个整数，用空格分隔。
示例1
输入
复制
1 2 3 4 5 6 7 8 9 10
输出
复制
10 9 8 7 6 5 4 3 2 1
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] nums=new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i]=in.nextInt();
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]+" ");
        }
    }
}
