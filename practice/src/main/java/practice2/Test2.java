package practice2;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/25
 */
public class Test2 {
    static int[] arr;
    static int count;
    public static void count(int m,int n){
        if (m == 0){
            count++;
            return;
        }
        if (m < 0 || m > 0 && n < 1 || n > 40){
            return;
        }
        count(m - arr[n] ,n-1);//从后往前装，装上arr[n]后，若剩余物品仍然有解
        count(m,n-1);//若装了arr[n]后，无解，则删除该包,尝试第n-1个
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            arr = new int[n+1];
            for(int i = 1;i <= n;i++){
                arr[i] = sc.nextInt();
            }
            count(40,n);
            System.out.println(count);
        }
    }
}
