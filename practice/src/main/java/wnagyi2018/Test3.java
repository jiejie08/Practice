package wnagyi2018;

/**
 * Author:li_d
 * Created:2019/8/3
 */

/*
对最近请求的过来的两条字符串（即最后两条），写程序找到最长公共子串。
 */
/*
首先对比两个串，找出长串和短串例如：长串是abcd,短串是abc    2.以短串为基准，循环查询子串，
看长串里面是否包含该子串(从短串abc中找子串：ab,abc,bc三个，看这些子串是不是在长串    中abcd中）
    3.把子串也在长串中的公共字符串都放入到集合list中存储    4.在循环对比list集合中的每一个字符串的长度，
    记住最长的一个的下标index    5.输出该下标对应的list.get(index
---------------------
作者：bigFace2019
来源：CSDN
原文：https://blog.csdn.net/Handsome2013/article/details/81001871
版权声明：本文为博主原创文章，转载请附上博文链接！
 */
//public void test1() {
//    String str1 = "111111aaabbbccceeeeffffffffggghhh99999999999999999abc777777777777777555555";
//    String str2 = "aabbbccccffggghheeaaaccbbbbcc999999999999999999999999ghg";
//    String shortStr = str1.length() > str2.length() ? str2 : str1;
//    String longStr = str1.length() > str2.length() ? str1 : str2;
//    int index = 0;//最长字串的下标，是再list集合中的位置
//    List list = new ArrayList();//新建一个集合来装我们的符合条件的字串
//    for (int i = 0; i < shortStr.length() - 2; i++) {//循环查找字串，
//        for (int j = i + 2; j < shortStr.length(); j++) {
//            String same = shortStr.substring(i, j);
//            if (longStr.indexOf(same) != -1) {
//                list.add(same);//将公共字串放入到集合中
//        }
//        }
//    }
//    System.out.println(list);//输出所有公共字串
//    int max = list.get(0).toString().length();//先假设集合中第一个串长度最长
//    int tempmax;//一个过渡变量
//    for (int i = 1; i < list.size(); i++) {
//        if ((tempmax = list.get(i).toString().length()) > max) {
//            max = tempmax;
//            index = i;//记住最长字串的再集合中的位置
//        }
//    }
//    System.out.println(list.get(index));//打印出该公共子串
//}

public class Test3 {
}
