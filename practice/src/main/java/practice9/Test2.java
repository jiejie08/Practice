package practice9;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/27
 */


//求阶乘一旦溢出就报错，所以另寻它法
public class Test2 {
    public static long fib(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n-1) * n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(fib(n));
            String str = String.valueOf(fib(n));
            char[] arr = str.toCharArray();
            int count = 0;
            for(int i = str.length()-1;i >= 0;i--){
                if (arr[i] == '0'){
                    count++;
                }else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
