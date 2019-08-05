package practice5;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/25
 */
//计算糖果
public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a ,b ,c ;
        while(sc.hasNext()){
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int y3 = sc.nextInt();
            int y4 = sc.nextInt();
            a = (y1 + y3) / 2;
            b = (y2 + y4) / 2;
            c = (y4 - y2) / 2;
            if(y1+y2 != y3-y4 || y1+y4 != y3-y2){
                System.out.println("No");
                return;
            }
            System.out.println(a+" "+b+" "+c);
        }
    }
}
