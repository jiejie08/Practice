import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/10
 */
public class Test6 {

    private static void Swap(int[] array,int a, int b) {
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 1; i < arr.length; i++) {
                int flag = 0;
                for (int j = 0; j < arr.length - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        Swap(arr, j, j + 1);
                    }
                    flag = 1;
                }
                if (flag == 0) {
                    break;
                }
            }
            int count = 0;
            for (int i = n-1;i > 0;i--){
                for (int j = n-2;j > 0;j--){
                    for (int k = n-3;k > 0;k--){
                        if (arr[i] == arr[j] + arr[k]){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
