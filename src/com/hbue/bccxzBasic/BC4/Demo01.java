package com.hbue.bccxzBasic.BC4;
/*
题目描述
KiKi学会了printf在屏幕输出信息，他想输出一架小飞机。请帮他编写程序输出这架小飞机。
输入描述:
无
输出描述:

 */
public class Demo01 {
    public static void main(String[] args) {
        for (int i = 1; i <=11 ; i++) {
                switch (i){
                    case 1:
                    case 3:
                        System.out.println("     "+"**");
                        break;
                    case 5:
                    case 7:
                        System.out.println("************");
                        break;
                    case 9:
                    case 11:
                        System.out.println("    "+"*  "+"*");
                    break;
                    default:
                        break;
                }
        }
    }
}
