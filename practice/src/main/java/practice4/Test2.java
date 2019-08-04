package practice4;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/25
 */
public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int count = n / 6;
            if (n == 10  || n %2 != 0){
                count = -1;
            }
            if (n % 8 == 0){
                count = n / 8;
            }
            for(int i = 0;i < n / 6;i++){
                for (int j = 0;j < n / 8;j++){
                    if (i * 6 + j * 8 == n){
                        count = Math.min(count,i+j);
                    }
                }
            }
            System.out.println(count);
        }
    }
}
