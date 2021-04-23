package com.hbue.bccxzBasic.BC96;

import java.util.Scanner;

/*
题目描述
输入一个整数序列，判断是否是有序序列，有序，指序列中的整数从小到大排序或者从大到小排序。
输入描述:
第一行输入一个整数N(3≤N≤50)。
第二行输入N个整数，用空格分隔N个整数。
输出描述:
输出为一行，如果序列有序输出sorted，否则输出unsorted。
示例1
输入
复制
5
1 6 9 22 30
输出
复制
sorted
示例2
输入
复制
5
3 4 7 2 10
输出
复制
unsorted
 */
public class Demo01 {
    public static void main(String[] args) {
        Boolean flag=false;
        Scanner in=new Scanner(System.in);
        int a=Integer.parseInt(in.nextLine());
        String[] strings=in.nextLine().split("\\s");
        int[] nums=new int[a];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=Integer.parseInt(strings[i]);
        }
        if (nums[1]>nums[0]){
            for (int i = 0; i < nums.length-1; i++) {
                if(nums[i]<nums[i+1]){
                    flag=true;
                }else {
                    flag=false;
                    break;
                }
            }
        }else {
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i]>=nums[i+1]){
                    flag=true;
                }else {
                    flag=false;
                    break;
                }
            }
        }


        if (flag){
            System.out.println("sorted");
        }else {
            System.out.println("unsorted");
        }
    }
}
