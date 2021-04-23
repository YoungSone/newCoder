package com.hbue.bccxzBasic.BC99;

import java.util.ArrayList;
import java.util.Scanner;

/*
题目描述
输入n个整数的序列，要求对这个序列进行去重操作。所谓去重，是指对这个序列中每个重复出现的整数，只保留该数第一次出现的位置，删除其余位置。
输入描述:
输入包含两行，第一行包含一个正整数n（1 ≤ n ≤ 1000），表示第二行序列中数字的个数；第二行包含n个整数（范围1~5000），用空格分隔。

输出描述:
输出为一行，按照输入的顺序输出去重之后的数字，用空格分隔。

示例1
输入
复制
5
10 12 93 12 75
输出
复制
10 12 93 75
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String[] strings=in.nextLine().split("\\s");
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (arrayList.indexOf(Integer.parseInt(strings[i]))==-1){
                arrayList.add(Integer.parseInt(strings[i]));
            }
        }
        for (Integer integer : arrayList) {
            System.out.print(integer+" ");
        }
    }

}
