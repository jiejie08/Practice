package com.ld;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/6/4
 */
public class GetSequeOddNum {
    private static String GetSequeOddNum(int mun){
        String result = "";
        StringBuffer stringBuffer = new StringBuffer(result);
        for (int i = 0;i < 2*mun;i+=2){
            int a = mun*(mun-1)+1+i;
            stringBuffer.append(a+"+");
        }
        result = stringBuffer.toString();
        int length = result.length();
        result =  result.substring(0,length-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = "";
        str = GetSequeOddNum(n);
        System.out.println(str);
    }
}
