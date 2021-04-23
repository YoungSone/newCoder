package com.hbue.bccxzBasic.BC52;

import java.util.Scanner;
/*
在计算BMI（BodyMassIndex ，身体质量指数）的案例基础上，判断人体胖瘦程度。BMI中国标准如下表所示。


输入描述:
多组输入，每一行包括两个整数，用空格隔开，分别为体重（公斤）和身高（厘米）。
输出描述:
针对每行输入，输出为一行，人体胖瘦程度，即分类。
示例1
输入
复制
80 170
60 170
90 160
50 185
输出
复制
Overweight
Normal
Obese
Underweight
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double[] doubles=new double[2];
        while (in.hasNext()){
            doubles[0]=in.nextDouble();
            doubles[1]=in.nextDouble();
            double bmi=doubles[0]/((doubles[1]/100.0)*(doubles[1]/100.0));
            if (bmi<18.5){
                System.out.println("Underweight");
            }else if (bmi<=23.9){
                System.out.println("Normal");
            }else if (bmi<=27.9){
                System.out.println("Overweight");
            }else {
                System.out.println("Obese");
            }
        }
    }
}
