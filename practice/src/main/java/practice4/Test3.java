package practice4;


import java.util.Scanner;
/**
 * Author:li_d
 * Created:2019/7/25
 */
public class Test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            char[] arr = str1.toCharArray();
            for(int i = 0;i < str1.length();i++){
                if (!str2.contains(String.valueOf(arr[i]))){
                    System.out.print(arr[i]);
                }
            }
        }
    }
}