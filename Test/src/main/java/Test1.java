import java.math.BigInteger;
import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/3
 */
public class Test1 {
    private static String add(String num1, String num2)
    {
         int a = Integer.valueOf(num1);
         int b = Integer.valueOf(num2);
         BigInteger c = BigInteger.valueOf(a);
         int sum = a + b;
         String str = String.valueOf(sum);
         return str;
    }

    // please don't modify any code below.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        String sum = add(num1, num2);
        System.out.println(sum);
    }
}
