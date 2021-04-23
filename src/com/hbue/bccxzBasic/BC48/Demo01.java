package com.hbue.bccxzBasic.BC48;

import java.util.Scanner;

/*
题目描述
KiKi想完成字母大小写转换，有一个字符，判断它是否为大写字母，如果是，将它转换成小写字母；反之则转换为大写字母。
输入描述:
多组输入，每一行输入一个字母。
输出描述:
针对每组输入，输出单独占一行，输出字母的对应形式。
示例1
输入
复制
a
A
Z
输出
复制
A
a
z
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            byte[] bytes=in.nextLine().getBytes();
            if (bytes[0]>=65&&bytes[0]<=90){
                System.out.println((char)(bytes[0]+32));
            }else {
                System.out.println((char)(bytes[0]-32));
            }
        }
    }
}
