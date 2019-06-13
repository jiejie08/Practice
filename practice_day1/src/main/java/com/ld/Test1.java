package com.ld;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/6/3
 */
public class Test1 {
    public static String AddLongInteger(String added,String augend){
        BigInteger n1 = new BigInteger(added);
        BigInteger n2 = new BigInteger(augend);
        BigInteger sum = n1.add(n2);
        String Sum = sum.toString();
        return Sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str1 = scanner.next();
            String str2 = scanner.next();
            System.out.println(AddLongInteger(str1,str2));
        }
    }
}
