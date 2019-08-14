
import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/3
 */
public class Test2 {
    private static String add(String num1, String num2)
    {
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        String str = null;
        if (arr1.length <= arr2.length){
            int[] arr = new int[arr2.length+1];
            for (int i = arr1.length-1;i >= 0;i--){
                arr[i] = arr1[i] + arr2[i];
            }
            String str1 = String.valueOf(arr);
            String str2 = arr2.toString();
            StringBuffer stringBuffer1 = new StringBuffer(str1);
            StringBuffer stringBuffer2 = new StringBuffer(str2);
            stringBuffer2 = stringBuffer2.delete(arr2.length-arr1.length,arr2.length);
            stringBuffer2.append(stringBuffer1);
            str = stringBuffer2.toString();
        }else{
            int[] arr = new int[arr1.length];
            for (int i = arr2.length-1;i >= 0;i--){
                arr[i] = arr1[i] + arr2[i];
            }
            String str1 = String.valueOf(arr);
            String str2 = arr1.toString();
            StringBuffer stringBuffer1 = new StringBuffer(str1);
            StringBuffer stringBuffer2 = new StringBuffer(str2);
            stringBuffer2 = stringBuffer2.delete(arr1.length-arr2.length,arr1.length);
            stringBuffer2.append(stringBuffer1);
            str = stringBuffer2.toString();
        }
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
