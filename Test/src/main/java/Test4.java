import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/8
 */
public class Test4 {
    private static String add(String num1, String num2)
    {
        String a = null;
        if (num1.length() <= num2.length()){
            StringBuffer stringBuffer = new StringBuffer(num2);
            stringBuffer.delete(0,num1.length());
            StringBuffer stringBuffer1 = new StringBuffer(num2);
            stringBuffer1.delete(num1.length(),num2.length());
            String string = stringBuffer1.toString();
            String str = stringBuffer.toString();
            char[] arr1 = num1.toCharArray();
            char[] arr2 = str.toCharArray();
            int[] arr = new int[num2.length()+1];
            for (int i = 0;i < arr1.length;i++){
                arr[i] = arr1[i] + arr2[i];
            }
            String str1 = String.valueOf(arr);
            a = string+str1;
        }
        return a;
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
