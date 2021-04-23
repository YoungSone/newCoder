package com.hbue.bccxzBasic.BC53;

import java.util.Scanner;

/*
题目描述
从键盘输入a, b, c的值，编程计算并输出一元二次方程ax2 + bx + c = 0的根，当a = 0时，输出“Not quadratic equation”，当a ≠ 0时，根据△ = b2 - 4*a*c的三种情况计算并输出方程的根。
输入描述:
多组输入，一行，包含三个浮点数a, b, c，以一个空格分隔，表示一元二次方程ax2 + bx + c = 0的系数。
输出描述:
针对每组输入，输出一行，输出一元二次方程ax2 + bx +c = 0的根的情况。

  如果a = 0，输出“Not quadratic equation”；

  如果a ≠  0，分三种情况：

△ = 0，则两个实根相等，输出形式为：x1=x2=...。

△  > 0，则两个实根不等，输出形式为：x1=...;x2=...，其中x1  <=  x2。

△  < 0，则有两个虚根，则输出：x1=实部-虚部i;x2=实部+虚部i，即x1的虚部系数小于等于x2的虚部系数，实部为0时不可省略。实部= -b / (2*a),虚部= sqrt(-△ ) / (2*a)

所有实数部分要求精确到小数点后2位，数字、符号之间没有空格。

示例1
输入
复制
2.0 7.0 1.0
输出
复制
x1=-3.35;x2=-0.15
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double[] doubles=new double[3];
        while (in.hasNext()){
            for (int i = 0; i < 3; i++) {
                doubles[i]=in.nextDouble();
            }
            if (doubles[0]==0){
                System.out.println("Not quadratic equation");
            }else {
                double d=doubles[1]*doubles[1]-4*doubles[0]*doubles[2];
                if (d==0){
                    double x=-doubles[1]/(2*doubles[0]);
                    System.out.printf("x1=x2=%.2\nf",x);
                }else if (d>0){
                    double x1=(-doubles[1]-Math.sqrt(d))/(2*doubles[0]);
                    double x2=(-doubles[1]+Math.sqrt(d))/(2*doubles[0]);
                    System.out.printf("x1=%.2f;x2=%.2f\n",x1,x2);
                }else if (d<0){
                    double i=Math.sqrt(-d)/(2*doubles[0]);
                    double j=-doubles[1]/(2*doubles[0]);
                    System.out.printf("x1=%.2f-%.2fi;x2=%.2f+%.2fi\n",j,i,j,i);
                }
            }
        }
    }
}
