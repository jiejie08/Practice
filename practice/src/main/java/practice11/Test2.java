package practice11;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/1
 */
public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            char start = arr[0];
            char end = arr[arr.length -1];
            while(start < end){
                Swap(arr,arr[start],arr[end]);
                start++;
                end--;
            }
            String str1 = arr.toString();
            int a = Integer.valueOf(str);
            int b = Integer.valueOf(str1);
            int sum = a+b;
            System.out.println(sum);
        }
    }

    private static void Swap(char[] array,int a, int b) {
        char t = array[a];
        array[a] = array[b];
        array[b] = t;
    }
}
