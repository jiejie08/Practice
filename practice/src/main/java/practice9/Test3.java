package practice9;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/28
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = n;i >= 5;i--){
                int temp = i;
                while (temp % 5 == 0){
                    count++;
                    temp /= 5;
                }
            }
            System.out.println(count);
        }
    }
}
