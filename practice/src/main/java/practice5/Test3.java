package practice5;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/25
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            for (int i = 0;i < arr.length;i++){
                for (int j  = 0;j < arr.length;j++){
                    if (arr[i] == arr[j]){
                        count++;
                    }else {
                        continue;
                    }
                }
                if (count > arr.length/2){
                    System.out.println(arr[i]);
                    break;
                }else {
                    count = 0;
                }
            }
        }
    }
}
