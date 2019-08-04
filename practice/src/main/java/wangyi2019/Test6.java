package wangyi2019;

/**
 * Author:li_d
 * Created:2019/8/3
 */
/*
小易有一些立方体，每个立方体的边长为1，他用这些立方体搭了一些塔。
现在小易定义：这些塔的不稳定值为它们之中最高的塔与最低的塔的高度差。
小易想让这些塔尽量稳定，所以他进行了如下操作：每次从某座塔上取下一块立方体，并把它放到另一座塔上。
注意，小易不会把立方体放到它原本的那座塔上，因为他认为这样毫无意义。
现在小易想要知道，他进行了不超过k次操作之后，不稳定值最小是多少。
 */
/*
链接：https://www.nowcoder.com/questionTerminal/54868056c5664586b121d9098d008719
来源：牛客网

//数据输入完毕  //计算数据输出，即不稳定度s和最小操作次数m    //最大操作次数k，每次操作必定是由最高塔移到最低塔最合算
//每次操作前后输入输出数据的类型不变    //每次操作前进行如下判断：    //如果最大值最小值两者相差小于2，此时停止操作
//否则每次操作对不稳定度的影响分为3种情况：    //1.最大值和最小值唯一，此时s-2
//2.最大值和最小值其中仅有一个不唯一，此时s-1    //3.最大值和最小值都不唯一，此时s-0
/*****************************改进算法*****************************/
//每次操作前先统计出最大值和最小值集合，然后以最大值和最小值之差作为结束操作的一个判断参数（另一个判断参数为k）
// 最大值（maxSet）最小值(minSet)集合中的元素个数差，将作为s参数的更新依据，同时也是更新最大值最小值集合的依据
// min{|maxSet|,|minSet|}将作为更新m参数的依据
// ****************************进一步改进*********************************
// 每次计算最大最小值集合都要遍历数组将是十分耗时的，所以不妨对塔高进行排序，这在k>n时比较有用
// 采用while循环，每次开始前进行判断与s参数以及m参数的更新
// ****************************冒泡排序a[n][2]从小到大排序*****************

import java.util.ArrayList;
import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//塔数
        int k = scan.nextInt();//最多可操作数
        int[] height = new int[n];//塔的高度
        for (int i = 0; i < n; i++) {
            height[i] = scan.nextInt();
        }
        int count = 0;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            int h = max(height);//找到最高的
            int l = min(height);//找到最低的
            if(balance(height[h],height[l])) {
                break;
            }
            count++;
            height[h]--;
            height[l]++;
            list1.add(h+1);
            list2.add(l+1);
        }
        System.out.println(height[max(height)]-height[min(height)]+" "+count);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i)+" "+list2.get(i));
        }
    }
    public static int max(int[] height) {//返回最高塔的下标
        int h = 0;
        int max = height[0];
        for (int i = 1; i < height.length; i++) {
            if(max<height[i]) {
                h = i;
                max = height[i];
            }
        }
        return h;
    }
    public static int min(int[] height) {//返回最低塔的下标
        int l = 0;
        int min = height[0];
        for (int i = 1; i < height.length; i++) {
            if(min>height[i]) {
                l = i;
                min = height[i];
            }
        }
        return l;
    }
    public static boolean balance(int hval,int lval){//判断是否平衡
        boolean flag = false;
        int x = hval-lval;
        if(x<=1)
            flag = true;
        return flag;
    }
}



