package practice8;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/26
 */
public class Test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] str1 = str.split(" ");
            int[] arr = new int[str1.length - 1];
            for(int i = 0;i < arr.length;i++){
                arr[i] = Integer.parseInt(str1[i]);
            }
            int k = Integer.parseInt(str1[str1.length - 1]);
            for(int i = 0;i < arr.length;i++){
                for(int j = i+1;j < arr.length;j++){
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for(int i = 0;i < k;i++){
                System.out.print(i==k-1?arr[i]:arr[i] + " ");
            }
        }
    }
}
