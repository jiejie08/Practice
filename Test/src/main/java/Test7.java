import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/10
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n > 2 && n<50000){
                int[] arr = new int[n];
                for (int i = 0;i < n;i++){
                    arr[i] = sc.nextInt();
                }
                int max = 0;
                int count = 0;
                for (int i = 0;i < n;i++){
                    for (int j = 1;j < n;j++){
                        if (arr[i] < arr[j]){
                            count++;
                        }
                    }
                    if (max < count){
                        max = count;
                    }
                    count = 0;
                }
                System.out.println(max);
            }
        }
    }
}
