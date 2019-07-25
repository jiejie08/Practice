package practice4;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/25
 */
public class Test1 {
        public static int count(int n){
            int count = 0;
            if(n % 2 != 0 || n == 10 || n < 6){
                return -1;
            }
            if(n % 8 == 0){
                count = n / 8;
            }
            if(n % 8 == 6 || n % 8 == 4){
                count = n / 8 +1;
            }
            if(n % 8 == 2){
                count = n / 6;
            }
            return count;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int n = sc.nextInt();
                System.out.println(count(n));
            }
        }
}
