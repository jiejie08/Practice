package practice13;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/5
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            BigInteger a = new BigInteger(str1);
            BigInteger b = new BigInteger(str2);
            System.out.println(a.add(b));
        }
    }
}
