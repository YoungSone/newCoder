package com.hbue.bccxzBasic.BC40;

import java.util.Scanner;

/*
题目描述
假设你们社团要竞选社长，有两名候选人分别是A和B，社团每名同学必须并且只能投一票，最终得票多的人为社长.
输入描述:
一行，字符序列，包含A或B，输入以字符0结束。
输出描述:
一行，一个字符，A或B或E，输出A表示A得票数多，输出B表示B得票数多，输出E表示二人得票数相等。
示例1
输入
复制
ABBABBAAB0
输出
复制
B

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        byte[] bytes=in.nextLine().getBytes();
        int a=0;
        int b=0;
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i]==65){
                a++;
            }else if (bytes[i]==66){
                b++;
            }

        }
        if (a>b){
            System.out.println("A");
        }else if (a==b){
            System.out.println("E");
        }else {
            System.out.println("B");
        }
    }
}
