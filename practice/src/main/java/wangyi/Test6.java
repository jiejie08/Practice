package wangyi;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/2
 */

//        #include<cstdio>
//        #include<cstring>
//        #include<algorithm>
//        using namespace std;
//
//        int main()
//        {
//        char S[100];
//        int num[27];
//        int L,cnt;
//        for (int i=0;i<27;i++) num[i]=0;
//
//        scanf("%s",S);
//        L=strlen(S);
//        cnt=0;
//        for (int i=0;i<L;i++) num[S[i]-64]++;
//        for (int i=0;i<27;i++)
//        {
//        if (num[i]!=0) cnt++;
//        if (cnt>2) break;
//        }
//        if (cnt>2) printf("0\n");
//        else if (cnt==1) printf("1\n");
//        else if (cnt==2) printf("2\n");
//
//        return 0;
//        }
import java.util.Scanner;

/*
链接：https://www.nowcoder.com/questionTerminal/313ecbd798f24a048944000297735aae
来源：牛客网

小易有一些彩色的砖块。每种颜色由一个大写字母表示。各个颜色砖块看起来都完全一样。现在有一个给定的字符串s,
s中每个字符代表小易的某个砖块的颜色。小易想把他所有的砖块排成一行。如果最多存在一对不同颜色的相邻砖块,
那么这行砖块就很漂亮的。请你帮助小易计算有多少种方式将他所有砖块排成漂亮的一行。(如果两种方式所对应的砖块颜色序列是相同的,
那么认为这两种方式是一样的。) 例如: s = "ABAB",那么小易有六种排列的结果: "AABB","ABAB","ABBA","BAAB","BABA","BBAA"
 其中只有"AABB"和"BBAA"满足最多只有一对不同颜色的相邻砖块。
 */
import java.util.HashSet;

public class Test6{

    public static void main(String [] args){

        Scanner sc=new Scanner (System.in);

        while(sc.hasNext()){

            String str=sc.nextLine();

            HashSet<Character> hs=new HashSet<>();

            char[] nums=str.toCharArray();

            for(int i =0;i<nums.length;i++){

                hs.add(nums[i]);

            }

            if(hs.size()==1)

                System.out.println(1);

            else if(hs.size()==2)

                System.out.println(2);

            else

                System.out.println(0);

        }

    }

}
