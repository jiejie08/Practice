package wnagyi2018;

/**
 * Author:li_d
 * Created:2019/8/3
 */
/*
给定5个正整数, 它们的最小的众倍数是指的能够被其中至少三个数整除的最小正整数。
给定5个不同的正整数, 请计算输出它们的最小众倍数。
 */
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = new int[5];
//        Scanner input = new Scanner(System.in);
//        for(int i=0;i<5;i++) {
//            arr[i] = input.nextInt();
//        }
//        int count = 0;
//        int result = 0;
//        Arrays.sort(arr);//将数组排序
//        for(int i = arr[2];;i++) {//最小的最小众倍数肯定是大于或等于arr[2]
//            count = 0;
//            for(int j=0;j<5;j++) {
//                if(i%arr[j]==0) {
//                    count++;//每满足一次条件加1
//                }                 }
//            if(count >= 3) {//如果count>=3 则满足题目条件
//                result = i;
//                break;
//            }
//        }
//        System.out.println(result);
//    }
//}
public class Test4 {
}
