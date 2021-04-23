package com.hbue.bccxzBasic.BC51;
/*
题目描述
KiKi想知道已经给出的三条边a，b，c能否构成三角形，如果能构成三角形，判断三角形的类型（等边三角形、等腰三角形或普通三角形）。
输入描述:
题目有多组输入数据，每一行输入三个a，b，c(0<a,b,c<1000)，作为三角形的三个边，用空格分隔。
输出描述:
针对每组输入数据，输出占一行，如果能构成三角形，等边三角形则输出“Equilateral triangle!”，等腰三角形则输出“Isosceles triangle!”，其余的三角形则输出“Ordinary triangle!”，反之输出“Not a triangle!”。
示例1
输入
复制
2 3 2
3 3 3
输出
复制
Isosceles triangle!
Equilateral triangle!

 */
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double[] doubles=new double[3];
        while (in.hasNext()){
            for (int i = 0; i < 3; i++) {
                doubles[i]=in.nextDouble();
            }
            if (doubles[0]==doubles[1]&&doubles[1]==doubles[2]){
                System.out.println("Equilateral triangle!");
            }else if (doubles[0]==doubles[1]||doubles[1]==doubles[2]||doubles[0]==doubles[2]){
                if ((doubles[0]+doubles[1])>doubles[2]&&(doubles[1]+doubles[2]>doubles[0])&&(doubles[0]+doubles[2]>doubles[1])){
                    System.out.println("Isosceles triangle!");
                }else {
                    System.out.println("Not a triangle!");
                }
            }else if ((doubles[0]+doubles[1])>doubles[2]&&(doubles[1]+doubles[2]>doubles[0])&&(doubles[0]+doubles[2]>doubles[1])){
                System.out.println("Ordinary triangle!");
            }else {
                System.out.println("Not a triangle!");
            }
        }

    }
}
