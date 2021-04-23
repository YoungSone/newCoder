package com.hbue.bccxzBasic.BC120;

import java.util.*;

public class Demo02 {
    public static void main(String[] args) {
        //思路是先列出来所有二段数，然后再判断倍数。当输入数字位数为5，答案二段数大于40位时会提交超时。
        Scanner in=new Scanner(System.in);
        LinkedHashMap<Integer,Object> linkedHashMap=new LinkedHashMap<>();
        while (in.hasNext()){
            int n=Integer.parseInt(in.nextLine());
            if (n==0){
                break;
            }else {
                linkedHashMap.put(n,null);
            }
        }


    }

    public static LinkedHashMap<Integer,Object> getNum(LinkedHashMap<Integer,Object> linkedHashMap){
        Set<Integer> keys=linkedHashMap.keySet();
        for (Integer key : keys) {
            long num=key+1;
            while (num>key){
                if (isAscAndtwoNum(num)){
                    break;
                }else {
                    num++;
                }
            }

        }
        return linkedHashMap;
    }
    //判断是否是有序的 且 只存在两个数字
    public static boolean isAscAndtwoNum(long num){
        boolean flag=false;
        byte[] bytes=String.valueOf(num).getBytes();
        HashSet<Byte> set=new HashSet<>();
        for (int i = 0; i < bytes.length-1; i++) {
            // System.out.println(bytes[i]);
            if (bytes[i]>=bytes[i+1]){
                flag=true;
            }else {
                flag=false;
                break;
            }
        }
        // System.out.println(set.size());
        // 判断bytes是否只含两种字符
        for (int i = 0; i < bytes.length; i++) {
            set.add(bytes[i]);
        }
        if (set.size()!=2){
            flag=false;
        }
        return flag;
    }
}
