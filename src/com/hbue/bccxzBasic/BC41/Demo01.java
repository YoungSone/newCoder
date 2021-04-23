package com.hbue.bccxzBasic.BC41;

import java.util.Scanner;

/*
题目描述
据说智商140以上者称为天才，KiKi想知道他自己是不是天才，请帮他编程判断。输入一个整数表示一个人的智商，如果大于等于140，则表明他是一个天才，输出“Genius”。
输入描述:
多组输入，每行输入包括一个整数表示的智商。
输出描述:
针对每行输入，输出“Genius”。
示例1
输入
复制
160
输出
复制
Genius

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if (num>=140){
            System.out.println("Genius");
        }
    }
}
