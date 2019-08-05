package practice;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/2
 */
public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            if(n % 2 == 0){
                for(int i = n - 1; i > 0; i = i - 2){
                    System.out.print(arr[i]+" ");
                }
                for(int i = 0; i < n-1; i = i + 2){
                    System.out.print(arr[i]+" ");
                }
            }else{
                for(int i = n - 1; i >= 0; i = i - 2){
                    System.out.print(arr[i]+" ");
                }
                for(int i = 1; i < n - 1; i += 2){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
