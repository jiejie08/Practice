import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/8
 */
public class Test3 {
    private static String process(String num1, String num2)
    {
        //Please write your code here
        int n2 = Integer.valueOf(num2);
        String a = null;
        if (n2 < 1){
            a = "-1";
        }
        if (n2 < 10){
            a = String.valueOf(n2);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strValueSequences = sc.nextLine();
        String strChargeNum = sc.nextLine();

        String sum = process(strValueSequences, strChargeNum);
        System.out.println(sum);
    }
}
