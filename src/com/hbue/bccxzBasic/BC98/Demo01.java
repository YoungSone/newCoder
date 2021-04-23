package com.hbue.bccxzBasic.BC98;

import java.util.ArrayList;
import java.util.Scanner;

/*
题目描述
有一个整数序列（可能有重复的整数），现删除指定的某一个整数，输出删除指定数字之后的序列，序列中未被删除数字的前后位置没有发生改变。
输入描述:
第一行输入一个整数(0≤N≤50)。

第二行输入N个整数，输入用空格分隔的N个整数。

第三行输入想要进行删除的一个整数。

输出描述:
输出为一行，删除指定数字之后的序列。
示例1
输入
复制
6
1 2 3 4 5 9
4
输出
复制
1 2 3 5 9

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String[] strings=in.nextLine().split("\\s");
        Integer num=Integer.parseInt(in.nextLine());
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (num==Integer.parseInt(strings[i])){
                strings[i]="";
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i]!=""){
                System.out.print(strings[i]+" ");
            }
        }

    }
}
