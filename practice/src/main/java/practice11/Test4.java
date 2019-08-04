package practice11;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/1
 */
public class Test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            for(int i = 0;i < n;i++){
                int m = sc.nextInt();
                String strs[] = sc.nextLine().split(" ");
                if(strs.length != m){
                    return;
                }
                for (int j = 0;j < strs.length;j++){
                    if (Integer.valueOf(strs[i]) % 4 == 0){

                    }
                }
            }
        }
    }
}
