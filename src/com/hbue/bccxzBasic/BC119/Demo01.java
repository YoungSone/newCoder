package com.hbue.bccxzBasic.BC119;

import java.util.Scanner;

/*
题目描述
在庆祝祖国母亲70华诞之际，老师给小乐乐出了一个问题。大家都知道China的英文缩写是CHN，那么给你一个字符串s，你需要做的是统计s中子串“CHN”的个数。
子串的定义：存在任意下标a < b < c，那么“s[a]s[b]s[c]”就构成s的一个子串。如“ABC”的子串有“A”、“B”、“C”、“AB”、“AC”、“BC”、“ABC”。


输入描述:
输入只包含大写字母的字符串s。(1 ≤ length ≤ 8000)
输出描述:
输出一个整数，为字符串s中字串“CHN”的数量。
示例1
输入
复制
CCHNCHN
字串 ：C1H1N1 C1H2N2 C2H1N1
输出
复制
7
示例2
输入
复制
CCHNCHNCHNCHN
输出
复制
30
 */
public class Demo01 {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            String str=in.nextLine();
            char[] chars=str.toCharArray();
            long c=0;
            long h=0;
            long count=0;
            for (int i = 0; i < chars.length; i++) {
                switch (chars[i]){
                    //判断字符是否为 C
                    case 'C':
                        c++;
                        break;
                    //判断字符是否为H
                    // 如果是H 与C的组合就有 出现 C的次数 +h的次数
                    // 第一次出现 时 h为0
                    // 第二次出现时 h=上一次出现时H与C的组合次数 +C的次数
                    case 'H':
                        h+=c;
                        break;
                    case 'N':
                        count+=h;
                }
            }
            System.out.println(count);

    }
}
