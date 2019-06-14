package com.ld;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/6/13
 */
//生兔子，第三个月兔子长大才可以生，统计兔子数量
public class Test2 {
    public static int getTotalCount(int monthCount){
        if (monthCount <= 2){
            return 1;
        }
        return getTotalCount(monthCount-2) + getTotalCount(monthCount-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(getTotalCount(n));
        }
    }
}
