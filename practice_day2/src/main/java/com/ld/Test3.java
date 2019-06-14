package com.ld;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/6/14
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();//
            char[] chars = str.toCharArray();
            String arr = "";
            for (int i = 0;i < chars.length;i++){

                if (chars[i] == ' '){
                    arr = arr + " ";
                }
                else if (chars[i] >= 65 && chars[i] <= 69){
                    int a = chars[i] + 21;
                    arr = arr + (char)a;
                }else {
                    int b = chars[i] - 5;
                    arr = arr + (char)b;
                }

            }
            System.out.println(arr);
        }
    }
}
