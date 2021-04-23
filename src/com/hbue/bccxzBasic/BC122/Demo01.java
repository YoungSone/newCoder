package com.hbue.bccxzBasic.BC122;

import java.util.Scanner;
/*

一行，总分和平均分（小数点后保留两位），用一个空格隔开。
示例1
输入
复制
79.5 80.0 98.0
输出
复制
257.50 85.83

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] strings=in.nextLine().split("\\s");
        float sum=0;
        for (String string : strings) {
            sum+=Float.parseFloat(string);
        }
        System.out.printf("%.2f %.2f",sum,sum/3.0);
    }
}
