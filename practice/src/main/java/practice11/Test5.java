package practice11;

/**
 * Author:li_d
 * Created:2019/8/4
 */
/*
链接：https://www.nowcoder.com/questionTerminal/94a4d381a68b47b7a8bed86f2975db46
来源：牛客网

给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class Test5 {
    public int[] multiply(int[] A) {
        int[] arr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int res = 1;
            for (int j = 0; j < A.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    res = res * A[j];
                }
            }
            arr[i] = res;
        }
        return arr;
    }
}
