package practice13;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/5
 */
public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        String str = sc.nextLine();
        int row = (col + 1)/2;
        for (int i = 1;i <= col;i++){
            System.out.print(str);
        }
        System.out.println();
        for (int i = 2;i < row;i++){
            System.out.print(str);
            for (int j = 2; j < col;j++){
                System.out.print(" ");
            }
            System.out.println(str);
        }
        for (int i = 1;i <= col;i++){
            System.out.print(str);
        }
    }
}
