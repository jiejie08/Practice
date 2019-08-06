package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/1
 */
public class Test4 {
    public static void add(Byte b)    {
        b = b++;
    }
    public static void test()    {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
    }

    public static void main(String[] args){
           test();
    }
}
