package practice5;

import java.util.*;

/**
 * Author:li_d
 * Created:2019/7/25
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.useDelimiter("\n");
        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int[] arr = new int[strs.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.valueOf(strs[i]);
            }
            int count = 1;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            // 1 2 3 5 5 5 5 6
            for (int i = 0; i < arr.length - 1; i++) {
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
