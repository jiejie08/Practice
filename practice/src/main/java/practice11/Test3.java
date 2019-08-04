package practice11;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/1
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            StringBuffer str1 = new StringBuffer(str);
            str1.reverse();
            String str2 = str1.toString();
            int a = Integer.valueOf(str);
            int b = Integer.valueOf(str2);
            int sum =  a + b;
            System.out.println(sum);
        }
    }
}
