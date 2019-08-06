package practice10;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/1
 */
public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int a = 0,b = 1,c = 1;
            while(c < n){
                a = b;
                b = c;
                c = a + b;
//                a = b;  //为什么这个不行
//                b = c;
            }
            int s1 = c - n;
            int s2 = n - b;
            System.out.println(((s1 > s2) ? s2 : s1));
        }
    }
}

