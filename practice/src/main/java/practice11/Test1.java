package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/1
 */
/*
链接：https://www.nowcoder.com/questionTerminal/a2063993dd424f9cba8246a3cf8ef445
来源：牛客网

给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)，
请编写程序统计每种不同的个位数字出现的次数。例如：给定N = 100311，则有2个0，3个1，和1个3。
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            int[] arr = new int[10];
            for(int i = 0;i<str.length();i++)
                arr[str.charAt(i)-'0']++;//统计每个数的次数,字符与字符运算最终变为整型
            for(int i = 0;i<arr.length;i++)//此处为arr.length
                if(arr[i]!=0)
                    System.out.println(i+":"+arr[i]);
        }

    }
}

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String N = sc.next();
//        char[] chars = N.toCharArray();  /**  * list***有10个item表示0-9，每个item的值表示数字的个数   */
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(0);//初始化每个item都是0
//        }
//        for (int i = 0; i < chars.length; i++) {     // 每遇到一个数字，就把值+1
//            list.set(chars[i] - '0', list.get(chars[i] - '0') + 1);
//        }
//        for (int i = 0; i < list.size(); i++) {  或此处为10
//            if (list.get(i) > 0) {//必须要判断次数大于0
//                System.out.println(i + ":" + list.get(i));
//            }
//        }
//        }
//    }
//}

