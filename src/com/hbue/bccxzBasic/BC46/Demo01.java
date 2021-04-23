package com.hbue.bccxzBasic.BC46;

import java.util.Arrays;
import java.util.Scanner;

/*
题目描述
KiKi开始学习英文字母，BoBo老师告诉他，有五个字母A(a), E(e), I(i), O(o),U(u)称为元音，其他所有字母称为辅音，请帮他编写程序判断输入的字母是元音（Vowel）还是辅音（Consonant）。
输入描述:
多组输入，每行输入一个字母。
输出描述:
针对每组输入，输出为一行，如果输入字母是元音（包括大小写），输出“Vowel”，如果输入字母是非元音，输出“Consonant”。
示例1
输入
复制
A
b
输出
复制
Vowel
Consonant
 */
public class Demo01 {
    /*
    使用二分搜索法来搜索指定的 byte 型数组，以获得指定的值。必须在进行此调用之前对数组进行排序（通过 sort(byte[]) 方法）。如果没有对数组进行排序，则结果是不确定的。如果数组包含多个带有指定值的元素，则无法保证找到的是哪一个。
     */
    public static void main(String[] args) {
        byte[] bytes={'A','a','E','e','I','i','O','o','U','u'};
        Arrays.sort(bytes);
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            byte[] a=in.nextLine().getBytes();
            int i=Arrays.binarySearch(bytes,a[0]);
            if (i>=0){
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }
        }
    }
}
