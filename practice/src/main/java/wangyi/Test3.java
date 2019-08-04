package wangyi;

import sun.misc.Queue;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/2
 */
/*
小易将n个棋子摆放在一张无限大的棋盘上。第i个棋子放在第x[i]行y[i]列。同一个格子允许放置多个棋子。
每一次操作小易可以把一个棋子拿起并将其移动到原格子的上、下、左、右的任意一个格子中。小易想知道要
让棋盘上出现有一个格子中至少有i(1 ≤ i ≤ n)个棋子所需要的最少操作次数.
 */
//#include<iostream>
//        #include<vector>
//        #include<algorithm>
//        #include<cmath>
//        using namespace std;
//        typedef long long ll;
//        typedef struct node
//        {
//        int x,y,l;
//        vector<node> els;
//        bool operator <(const node& te) const
//        {
//        return l<te.l;
//        }
//        }node;
//        node se[2550];
//        int x[55],y[55],n;
//        void set_gather()
//        {
//        for(int i=1;i<=n;i++) cin>>x[i];
//        for(int i=1;i<=n;i++) cin>>y[i];
//        int pos=1;
//        for(int i=1;i<=n;i++)
//        {
//        for(int j=1;j<=n;j++)
//        {
//        se[pos].x=x[i];
//        se[pos].y=y[j];
//        for(int k=1;k<=n;k++)
//        {
//        node temp;
//        temp.x=x[k];
//        temp.y=y[k];
//        temp.l=abs(se[pos].x-temp.x)+abs(se[pos].y-temp.y);
//        se[pos].els.push_back(temp);
//        }
//        pos++;
//        }
//        }
//        for(int i=1;i<pos;i++) sort(se[i].els.begin(),se[i].els.end());
//        }
//        ll get_ans(int th,int num)
//        {
//        ll lenx=0,leny=0;
//        vector<int> xx,yy;
//        for(int i=0;i<num;i++)
//        {
//        xx.push_back(se[th].els[i].x);
//        yy.push_back(se[th].els[i].y);
//        }
//        sort(xx.begin(),xx.end());
//        sort(yy.begin(),yy.end());
//        int zx=xx[xx.size()/2],zy=yy[yy.size()/2];
//        for(int i=0;i<xx.size();i++) lenx+=abs(zx-xx[i]);
//        for(int i=0;i<yy.size();i++) leny+=abs(zy-yy[i]);
//        return lenx+leny;
//        }
//        int main()
//        {
//        while(cin>>n)
//        {
//        set_gather();
//        for(int i=1;i<=n;i++)
//        {
//        long long ans=ll(1)<<62;
//        for(int j=1;j<=n*n;j++) ans=min(ans,get_ans(j,i));
//        if(i!=n) cout<<ans<<" ";
//        else cout<<ans<<endl;
//        }
//        }
//        return 0;
//        }
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                y[i] = sc.nextInt();
            }

        }
    }
}
