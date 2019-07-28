package practice7;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/26
 */
//辗转相除法求最小公倍数
public class Test1 {
    public static int small(int a,int b){
        int c = 0;
        while(a%b != 0){
            c = a%b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int r = a*b/small(a,b);
            System.out.println(r);
        }
    }
}
