package com.hbue.bccxzBasic.BC97;

import java.util.Arrays;
import java.util.Scanner;

/*
题目描述
有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
输入描述:
第一行输入一个整数N(0≤N≤50)。

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
        int n=Integer.parseInt(in.nextLine());
        int[] nums=new int[n+1];
        String[] strings=in.nextLine().split("\\s");
        for (int i = 0; i < n; i++) {
            nums[i]=Integer.parseInt(strings[i]);
        }
        nums[n]=Integer.parseInt(in.nextLine());
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
}
