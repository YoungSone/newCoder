package com.hbue.bccxzBasic.BC55;

import java.util.Scanner;

/*
题目描述
KiKi实现一个简单计算器，实现两个数的“加减乘除”运算，用户从键盘输入算式“操作数1运算符操作数2”，计算并输出表达式的值，如果输入的运算符号不包括在（+、-、*、/）范围内，输出“Invalid operation!”。当运算符为除法运算，即“/”时。如果操作数2等于0.0，则输出“Wrong!Division by zero!”
输入描述:
多组输入，一行，操作数1运算符操作数2（其中运算符号包括四种：+、-、*、/）。
输出描述:
针对每组输入，输出为一行。

如果操作数和运算符号均合法，则输出一个表达式，操作数1运算符操作数2=运算结果，各数小数点后均保留4位，数和符号之间没有空格。

如果输入的运算符号不包括在（+、-、*、/）范围内，输出“Invalid operation!”。当运算符为除法运算，即“/”时。

如果操作数2等于0.0，则输出“Wrong!Division by zero!”。
示例1
输入
复制
1.0+3.0
1.0;4.0
44.0/0.0
输出
复制
1.0000+3.0000=4.0000
Invalid operation!
Wrong!Division by zero!
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str=in.nextLine();
            String[] strings= str.split("[-+*/]");
           // System.out.println(strings[0]);
            if (strings.length<2){
                System.out.println("Invalid operation!");
            }else {
                double a=Double.parseDouble(strings[0]);
                double b=Double.parseDouble(strings[1]);
                String opt=str.substring(strings[0].length(),strings[0].length()+1);
                //System.out.println(opt);
                switch (opt){
                    case "+":
                        System.out.printf("%.4f"+opt+"%.4f=%.4f",a,b,a+b);
                        break;
                    case "-":
                        System.out.printf("%.4f"+opt+"%.4f=%.4f",a,b,a-b);
                        break;
                    case "*":
                        System.out.printf("%.4f"+opt+"%.4f=%.4f",a,b,a*b);
                        break;
                    case "/":
                        if (b==0){
                            System.out.printf("Wrong!Division by zero!");
                        }else {
                            System.out.printf("%.4f"+opt+"%.4f=%.4f",a,b,a/b);
                        }

                        break;
                        default:
                            break;
                }
                System.out.println();
            }
        }
    }
}
