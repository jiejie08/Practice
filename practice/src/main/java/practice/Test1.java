package practice;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/2
 */
public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            for (int i = 0;i < n;i++){
                StringBuffer str1 = new StringBuffer();
                str1.append(arr[i]);
                StringBuffer str2 = str1.reverse();
                if (i == n-1){
                    System.out.println(str2 + " ");
                }
            }
        }
    }
}
