package practice5;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/25
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            int count = 1;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i]);
                if (arr[i] == arr[i + 1]) {
                    count++;
                }else {
                    if (count > arr.length/2){
                        System.out.println(arr[i]);
                        return;
                    }else {
                        count = 1;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
