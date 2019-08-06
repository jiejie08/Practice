package wnagyi2018;

/**
 * Author:li_d
 * Created:2019/8/3
 */

/*
牛牛有一个正整数x,牛牛需要把数字x中的数位进行重排得到一个新数(不同于x的数),
牛牛想知道这个新数是否可能是原x的倍数。请你来帮他解决这个问题。
 */
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int t = input.nextInt();
//        for(int j = 0;j<t;j++){
//            int x = input.nextInt();
//            boolean flag = true;
//            for(int i =2;i<=9;i++){
//                int y = x*i;
//                if(Equal(x,y)){
//                    System.out.println("Possible");
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag)
//                System.out.println("Impossible");
//        }
//    }
//    public static boolean Equal(int x,int y){
//        String str = String.valueOf(x);
//        String str1 = String.valueOf(y);
//        if(str.length() != str1.length())
//            return false;
//        char[] s1 =str.toCharArray();
//
//        char[] s2 =str1.toCharArray();
//        Arrays.sort(s1);
//        Arrays.sort(s2);
//        for(int i =0;i<s1.length;i++){
//            if(s1[i]!=s2[i])
//                return false;
//        }
//        return true;
//
//    }
//
//}
public class Test2 {
}
