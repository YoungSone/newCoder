package com.hbue.bccxzBasic.BC3;
/*
题目描述
确定不同整型数据类型在内存中占多大（字节），输出不同整型数据类型在内存中占多大（字节）。
输入描述:
无
输出描述:
不同整型数据类型在内存中占多大（字节），具体格式详见输出样例，输出样例中的?为不同整型数据类型在内存中占的字节数。输出样例如下：
The size of short is ? bytes.
The size of int is ? bytes.
The size of long is ? bytes.
The size of long long is ? bytes.
 */
public class Demo01 {
    public static void main(String[] args) {
        /*
            使用到包装类的SIZE属性
         */
        System.out.println("The size of short is "+Short.SIZE/8+" bytes.");
        System.out.println("The size of int is "+Integer.SIZE/8+" bytes.");
        System.out.println("The size of long is "+Long.SIZE/8+" bytes.");
        System.out.println("The size of long long is "+Long.SIZE/8+" bytes.");

    }
}
