package practice3;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/24
 */
public class Test2 {
    public static int drink(int n){
        int count = 0;
        if (n == 2){
            count += 1;
        }
        while (n > 2){
            count += n / 3;
            n = n % 3 + n / 3;
            if(n == 2){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()){
            int n = sc.nextInt();
            count++;
            if (count == 10){
                break;
            }
            System.out.println(drink(n));
        }
    }
}

