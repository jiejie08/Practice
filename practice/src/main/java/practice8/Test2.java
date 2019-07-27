package practice8;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/26
 */
public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] str1 = str.split(" ");
            int[] arr = new int[str1.length - 1];
            for(int i = 0;i < arr.length;i++){
                arr[i] = Integer.parseInt(str1[i]);
            }
            int k = Integer.parseInt(str1[str1.length - 1]);
            quickSort(arr);
            for(int i = 0;i < k;i++){
                System.out.print(i==k-1?arr[i]:arr[i] + " ");
                //System.out.print(arr[i]+" ");  最后一个没有空格所以不能这样输出
            }
        }
    }

    public static void quickSort(int[] array){
        quickSortInner(array,0,array.length-1);
    }
    private static int PartSort(int[] array, int left, int right) {
        int key = array[right];//基准值
        int begin = left, end = right;
        while (begin < end)
        {
            while (begin < end && array[begin] <= key)
            {
                ++begin;
                //array[begin] > key
            }
            while (begin < end && array[end] >= key)
            {
                --end;
                //array[end] < key
            }
            Swap(array,begin,end);
        }
        //begin与end相遇，把key值放到此处
        Swap(array,begin,right);
        return begin;

    }

    private static void Swap(int[] array,int a, int b) {
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }

    private static void quickSortInner(int[] array, int left, int right) {
        if (left >= right){//需要判断左右区间是否存在，看是否还进行分支
            return;
        }
        int div = PartSort(array, left, right);
        //递归
        quickSortInner(array, left, div-1);
        quickSortInner(array, div+1, right);
    }
}
