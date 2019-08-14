import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/10
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            int min = 100000000;
            int count = 0;
            int a = 0;
            int b = 0;
            for (int i = 0;i < n-1;i++){
                count= Math.abs(arr[i+1] - arr[i]);
                if (min > count){
                    min = count;
                    a = arr[i];
                    b = arr[i+1];
                }
            }
            System.out.println(a+" "+b);
        }
    }
}
