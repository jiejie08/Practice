package wangyi;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/2
 */
/*
小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
1、将a_i放入b序列的末尾
2、逆置b序列
小易需要你计算输出操作n次之后的b序列。
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
