package com.hbue.bccxzBasic.BC85;
/*
题目描述
今年是2019年，KiKi想知道1~2019中有多少个包含数字9的数。包含数字的数是指有某一位是“9”的数，例如“2019”、“199”等。




输入描述:
无
输出描述:
一行，一个整数，表示1~2019中共有多少个数包含数字9。
 */
public class Demo01 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <=2019 ; i++) {
            byte[] bytes=String.valueOf(i).getBytes();
            for (int i1 = 0; i1 < bytes.length; i1++) {
                if (bytes[i1]=='9'){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
