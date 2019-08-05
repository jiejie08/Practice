package wnagyi2018;

/**
 * Author:li_d
 * Created:2019/8/3
 */
/*
牛牛手中有s份工作需要完成,牛牛准备将工作分给三位员工。考虑到三位员工还有其他工作需要做,牛牛规定他们每人必须要参与的工作数量分别是a,b,c。
牛牛需要制定详细的工作方案,需要满足每份工作至少有一个人做,同一份工作可以由两个或者三个人共同参与。牛牛一下意识到可能的工作方案很多,牛牛需要你帮他计算一下一共有多少种不同的工作方案(对于两种方案,如果某份工作分配的人或者人数不一样就考虑为不一样的工作方案)。

对于输入样例,s = 3, a = 3, b = 1, c = 1
a要参与所有三份工作,b和c各自有三种选择,所以不同的工作方案是3 * 3 * 1= 9
如果s = 3, a = 1, b = 1, c = 1
相当于对三个员工做全排列,所以不同的工作方案是3 * 2 * 1 = 6
 */
//import java.util.Scanner;
//
//public class Main{
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        final int mod = 1000000007;
//        try(Scanner in = new Scanner(System.in)){
//            int s = in.nextInt();
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int c = in.nextInt();
//            int cnt[][][][] = new int[51][51][51][51];
//            cnt[0][0][0][0] = 1;
//            for(int i = 1;i <= s; i++) {
//                for(int j = 0;j <= i; j++) {
//                    for(int k = 0; k <= i; k++) {
//                        for(int l = 0; l <= i; l++) {
//                            if(j != 0) cnt[i][j][k][l] = (cnt[i][j][k][l] % mod +  cnt[i-1][j-1][k][l] % mod) % mod;
//                            if(k != 0) cnt[i][j][k][l] = (cnt[i][j][k][l] % mod +  cnt[i-1][j][k-1][l] % mod) % mod;
//                            if(l != 0) cnt[i][j][k][l] = (cnt[i][j][k][l] % mod +  cnt[i-1][j][k][l-1] % mod) % mod;
//                            if(j!=0 && k!=0) cnt[i][j][k][l] = (cnt[i][j][k][l] % mod +  cnt[i-1][j-1][k-1][l] % mod) % mod;
//                            if(j!=0 && l!=0) cnt[i][j][k][l] = (cnt[i][j][k][l] % mod + cnt[i-1][j-1][k][l-1] % mod) % mod;
//                            if(k!=0 && l!=0) cnt[i][j][k][l] = (cnt[i][j][k][l] % mod +  cnt[i-1][j][k-1][l-1] % mod) % mod;
//                            if(j!=0 && k!=0 && l!=0) cnt[i][j][k][l] = (cnt[i][j][k][l] % mod +  cnt[i-1][j-1][k-1][l-1] % mod) % mod;
//                        }
//                    }
//                }
//            }
//            System.out.println(cnt[s][a][b][c]);
//        }
//    }
//
//}
public class Test1 {

}
