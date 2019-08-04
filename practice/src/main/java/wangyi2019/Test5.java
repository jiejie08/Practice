package wangyi2019;

/**
 * Author:li_d
 * Created:2019/8/3
 */
/*
今天上课，老师教了小易怎么计算加法和乘法，乘法的优先级大于加法，但是如果一个运算加了括号，那么它的优先级是最高的。例如：
1+2*3=7
1*(2+3)=5
1*2*3=6
(1+2)*3=9
现在小易希望你帮他计算给定3个数a，b，c，在它们中间添加"+"， "*"， "("， ")"符号，能够获得的最大值。
 */
/*
思路：
先排个序。
然后满足最小的两个值之和小于最大的值且最小值为1时，结果为（min+mid）*max，
否则结果为min*mid*max。
 */
//double max1(double a, double b) {
//    return max(a + b, a * b);
//}
//double max2(double a, double b, double c) {
//    return max(max1(max1(a, b), c), max1(a, max1(b, c)));
//}
//int main() {
//    double a = 0;
//    double b = 0;
//    double c = 0;
//    while (cin >> a >> b >> c) {
//        cout << max2(a, b, c) << endl;
//    }
//    return 0;
//}

//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc =  new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int[] d = new int[4];
//        d[0] = a + b + c;
//        d[1] = (a + b) * c;
//        d[2] = a + (b + c);
//        d[3] = a * b * c;
//        Arrays.sort(d);
//        System.out.println(d[3]);
//    }
//}


public class Test5 {
}
