package wangyi2019;

/**
 * Author:li_d
 * Created:2019/8/3
 */
/*
小易觉得高数课太无聊了，决定睡觉。不过他对课上的一些内容挺感兴趣，所以希望你在老师讲到有趣的部分的时候叫醒他一下。
你知道了小易对一堂课每分钟知识点的感兴趣程度，并以分数量化，以及他在这堂课上每分钟是否会睡着，你可以叫醒他一次，
这会使得他在接下来的k分钟内保持清醒。你需要选择一种方案最大化小易这堂课听到的知识点分值。
 */
//滑动窗口的动态规划
//int main() {
//        int n, k;
//        cin >> n >> k;
//        vector<int> a(n), t(n);
//        for (int i = 0; i < n; i++)
//        cin >> a[i];
//        int now = 0;
//        for (int i = 0; i < n; i++)
//        cin >> t[i], now += t[i] * a[i];
//        int res = now;
//        for (int i = 0; i < n;) {
//        now += (!t[i]) * a[i];
//        if (++i >= k) {
//        res = max(res, now);
//        now -= (!t[i - k]) * a[i - k];
//        }
//        }
//        cout << res << endl;
//        return 0;
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n;
//        int k;
//        while (s.hasNext()) {
//            n = s.nextInt();
//            k = s.nextInt();
//            int max = 0;//被重新叫醒后可得的最高分。
//            int sum = 0;//表示总的分数
//            int[] a = new int[n];
//            int[] t = new int[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = s.nextInt();
//            }
//            int now = 0;
//            for (int i = 0; i < n; i++) {
//                t[i] = s.nextInt();
//                now += t[i] * a[i];
//            }
//            int res = now;
//            for (int i = 0; i < n; ) {
//                if (t[i] == 0) {
//                    now += 1 * a[i];
//                }
//                if (++i >= k) {
//                    res = Math.max(res, now);
//                    if (i-k<n&&i-k>=0) {
//                        if (t[i-k] == 0) {
//                            now -= 1 * a[i-k];
//                        }
//                    }
//                }
//            }
//            System.out.println(res);
//        }
//    }
//}
public class Test2 {
}
