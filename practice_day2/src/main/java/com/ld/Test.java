package com.ld;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author:li_d
 * Created:2019/6/13
 */

//红包出现次数大于红包总数一半，返回
public class Test {
    public static int getValue(int[] gifts, int n) {
//        int flag = 0;
////        for (int i = 0;i < gifts.length;i++){
////            for (int j = i+1;j < gifts.length;j++){
////                if (gifts[i] > gifts[j]){
////                    int tmp = 0;
////                    tmp = gifts[i];
////                    gifts[i] = gifts[j];
////                    gifts[j] = tmp;
////                }
////                flag = 1;
////            }
////            if (flag == 0){
////                break;
////            }
////        }

        int count = 1;
        int max = 0;
        int a = 0;
        for (int i = 0;i < gifts.length-1;i++){
            if (gifts[i] == gifts[i+1]){
                count++;
            }
            if (count > max){
                max = count;
                a = gifts[i];
            }
        }
        if (max > gifts.length/2){
            return a;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,3,2,4,2,2,2};
        System.out.println(getValue(arr,7));
    }
}
