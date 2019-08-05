package wangyi2019;

/**
 * Author:li_d
 * Created:2019/8/3
 */
/*
又到了丰收的季节，恰逢小易去牛牛的果园里游玩。
牛牛常说他对整个果园的每个地方都了如指掌，小易不太相信，所以他想考考牛牛。
在果园里有N堆苹果，每堆苹果的数量为ai，小易希望知道从左往右数第x个苹果是属于哪一堆的。
牛牛觉得这个问题太简单，所以希望你来替他回答
 */
/*
注意:
1.此题必须用二分查找才能通过，编程时注意二分查找的区间设置。
2.引用函数时一定要传递实参（加入&）,形参传入函数，相当于copy了一个镜像会增加计算耗时。
 */
//#include<iostream>
// #include <vector>
// using namespace std;
// vector<int> core;
// 二分查找 /*输入:数组a,数字b输出：数字在数组的第几个位置内 如  2 5 7 9  ，2    1**/
//     int div(vector<int> &a, int &b){
//     int n = a.size();
//     if (a[0] >= b)
//         return 1;
//     else if (b > a[n - 1])
//         return -1;
//     int min_ = 0,
//            max_ = n - 1;
//     while (min_<max_)	{
//         int temp = (min_ + max_) / 2;
//         //cout << "min,max,temp=" << min_+1 << "," << max_+1 <<","<< temp+1<< endl;
//         if (a[temp] == b)
//             return temp + 1;
//         else if (a[temp + 1] == b)
//             return temp + 2;
//         else if (a[temp] < b && a[temp + 1] > b)
//             return temp + 2;
//         if (a[temp] < b)
//             min_ = temp;
//         else
//             max_ = temp;
//     }
//     return -1;
//     }
//     int main(){
//         int n, m;
//         cin >> n;
//         if (n == 1)
//         {
//             cout << "1";
//             return 0;
//         }
//         core.resize(n);
//         for (int i = 0; i <n; i++)	{
//             int C;
//             cin >> C;
//             if (i == 0)
//                 core[i] = C;
//             else
//                 core[i] = core[i - 1] + C;
//             //cout << " " << core[i];
//         }
//         cin >> m;
//         for (int i = 0; i <m; i++)	{
//             int C;
//             cin >> C;
//             cout << div(core, C) << endl;
//         }
//         return 0;
//     }


public class Test3 {
}
