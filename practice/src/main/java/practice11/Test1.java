package practice11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/1
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            char[] arr = str.toCharArray();
            ArrayList list = new ArrayList();
            for (int i = 0;i < arr.length;i++){
                list.add(i);
            }


        }
    }
}
