package practice7;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/26
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int W = sc.nextInt();
            int H = sc.nextInt();
            int oneline = (H/4)*2+((H%4 < 2)? H%4:2);
            int threeline = ((H-2)/4)*2+(((H-2)%4 < 2)? (H-2)%4:2);
            int ot = (oneline+threeline)*2;
            int sum = ot*(W/4);
            if(W%4 != 0 && W%4 <= 2){
                sum = sum + oneline*(W%4);
            }
            if(W%4 != 0 && W%4 > 2){
                sum = sum + oneline*2+threeline;
            }
            System.out.println(sum);
        }
    }
}
