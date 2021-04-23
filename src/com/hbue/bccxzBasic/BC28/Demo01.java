package com.hbue.bccxzBasic.BC28;

import java.util.Scanner;

/*
题目描述
实现字母的大小写转换。多组输入输出。
输入描述:
多组输入，每一行输入大写字母。
输出描述:
针对每组输入输出对应的小写字母。
示例1
输入
复制
A
B
输出
复制
a
b
备注:
多组输入过程中要注意“回车”也是字母，所以要“吸收”(getchar())掉该字母。
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str;
        int i=0;
        while (in.hasNext()){
            str=in.next();
            System.out.println(str.toLowerCase());
        }

    }
}
