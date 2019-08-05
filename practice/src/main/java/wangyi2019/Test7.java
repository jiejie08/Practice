package wangyi2019;

/**
 * Author:li_d
 * Created:2019/8/3
 */


//1.n个'z'和m个‘a’组成的组合数的关系
//        dp[i][j]=dp[i-1][j]+dp[i][j-1]
//        2.关于找第几个的问题，递归 固定右边x位，从m-1个z开始固定，a的个数逐渐增加
//        刚好没有进入下一层递归，就应该是aaazz..zzaaa这种形式
//        如果不是k不是刚好减去就应该是aa...aazxxxxx后面就进入xxxx里面再做一层递归
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in); int n=sc.nextInt();
//        int m=sc.nextInt();
//        int k=sc.nextInt();
//        long[][] dp=new long[101][101];
//        //dp[i][j]i个'a'和j个'b'的组合数 for(int i=0;i<101;i++)
//        for(int j=1;j<101;j++)
//            dp[0][j]=1; for(int i=1;i<101;i++) {
//                for(int j=1;j<101;j++) {
//                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
//                }
//            } if(dp[n][m]<k)
//            {
//                System.out.println("-1"); return;
//            }
//            Main main=new Main();
//            StringBuilder sb=new StringBuilder();
//            main.solve(n, m, k, sb, dp);
//    }
//    public void solve(int a,int z,int k,StringBuilder sb,long[][] dp) {
//        if(a==0) { for(int i=0;i<z;i++) sb.append("z");
//        System.out.println(sb.toString()); return;
//        }
//        if(z==0) { for(int i=0;i<a;i++) sb.append("a");
//        System.out.println(sb.toString()); return;
//        } int la=0,lz=z-1; while(k-dp[la][lz]>=0)
//        {
//            k-=dp[la][lz];
//            la++;
//        }
//        if(k==0){
//            for(int i=0;i<a-la+1;i++) sb.append("a");
//            for(int i=0;i<z;i++) sb.append("z");
//            for(int i=0;i<la-1;i++) sb.append("a");
//            System.out.println(sb.toString()); return;
//        } for(int i=0;i<a-la;i++) sb.append("a");
//        sb.append("z");
//        solve(la,lz,k,sb,dp);
//    }
//}有错

//import java.util.ArrayList;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int m = scan.nextInt();//a的个数
//        int n = scan.nextInt();//z的个数
//        long target = scan.nextInt();//目标第几个
//        long k =0;
//        ArrayList<String> list = new ArrayList<String>();
//        while(m>0&&n>0) {//当a和z均存在时执行
//            k = pz(m-1,n,target);//假设a确定，出去a之后剩余a和z的排列组合个数
//            if(k>=target) {//如果确定a之后，剩余的排列组合数大于目标，则说明a已确定
//                list.add("a");
//                m--;//a的个数减1
//                }else {//如果确定a之后，剩余的排列组合数小于目标，则说明不是a。
//                    list.add("z");
//                    n--;//z的个数减1
//                    target -= k;//目标减掉排列组合数。因为如果a开头可以有k中情况，
//                // 减掉k之后即为确定z开头之后，接下来找第target个即可。
//                }
//        }
//        if(target != 1) {//存在经过计算之后必为1
//            System.out.println("-1");
//            return;
//        }else {
//            while(m>0) {//如果z的个数为0，则将a追加到最后即可
//                list.add("a");
//                m--;
//            }
//            while(n>0) {//如果a的个数为0，则将z追加到最后即可
//
//                list.add("z");
//                n--;
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//        }
//    }
//    public static long pz(int m,int n,long target) {//计算假设a确定之后，a之后的部分排列组合数
//        if(m==0||n==0)
//            return 1;
//        long sum = m+n;
//        long k = 1;
//        n = Math.min(m, n);//C(m+n) n=C(m+n) m  取最小即可
//        for (int i = 0; i < n ; i++) {
//            k *= sum-i;
//            k /= (i+1);
//            if(k>target)//防止大数。如果k>target 则只进行list.add("a")和m--//a的个数减1。
//                // 没有target -= k;因此不影响
//                break;
//        }
//        return k;
//    }
//}
public class Test7 {
}
