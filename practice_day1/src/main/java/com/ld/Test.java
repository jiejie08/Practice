package com.ld;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/6/2
 */

//输入N,特定字符，从而打印正方形，输出的行数是列数的一半

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //char c = scanner.next().charAt(0);
        String c = scanner.next();
        int line,list;
        if (n<3 || n>20){
            System.out.println("n值不符合要求");
        }else {
            line = (n+1)/2;
            list = n;
            for (int i = 0;i < line;i++){
                if (i == 0 || i == line-1){
                    for (int j = 0;j < list;j++){
                        System.out.print(c);
                    }
                    System.out.println();
                }else {
                    for (int j = 0;j < list;j++){
                        if (j == 0 || j == list -1){
                            System.out.print(c);
                        }else {
                            continue;
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
