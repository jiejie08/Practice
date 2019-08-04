package wangyi;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/2
 */
/*
小易有一个长度为N的正整数数列A = {A[1], A[2], A[3]…, A[N]}。
牛博士给小易出了一个难题:
对数列A进行重新排列,使数列A满足所有的A[i] * A[i + 1](1 ≤ i ≤ N - 1)都是4的倍数。
小易现在需要判断一个数列是否可以重排之后满足牛博士的要求。
 */
/*
1如果数列中没有只能被2整除不能被4整除的数，就判断能被4整除的数量是否大于等于奇数-1
*2如果数列中有只能被2整除不能被4整除的数，就判断能被4整除的数量是否大于等于奇数
 */

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int cnt = sc.nextInt();
            for(int x=0; x<cnt; x++) {
                int len = sc.nextInt();

                int fourTimes = 0;
                int odd = 0;
                for(int idx=0; idx<len; idx++) {
                    int num = sc.nextInt();
                    if(num%2 == 1)
                        odd++;
                    else if(num%4 == 0)
                        fourTimes++;
                }
                if(fourTimes >= odd)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}