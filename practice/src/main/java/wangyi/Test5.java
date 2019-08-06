package wangyi;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/8/2
 */
/*
合法括号如样例所示: s = "(())()",跟字符串s长度相同的合法括号匹配序列有:
"()(())", "((()))", "()()()", "(()())",其中LCS( "(())()", "()(())" )为4,其他三个都为5,所以输出3.
 */
import java.util.*;
public class Test5{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(work(s));
    }
    public static int work(String s){
        Set<String> set=new HashSet<String>();
        int len=s.length();
        for(int i=0;i<len;i++){
            StringBuilder st=new StringBuilder();
            st.append(s.substring(0,i));
            st.append(s.substring(i+1));
            for(int j=0;j<len-1;j++){
                StringBuilder sw=new StringBuilder();
                sw.append(st.substring(0, j));
                sw.append(s.charAt(i));
                sw.append(st.substring(j));
                if(legal(sw.toString()))
                    set.add(sw.toString());
            }
        }
        return set.size()-1;
    }
    public static boolean legal(String s){
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                count++;
            else
                count--;
            if(count<0)
                return false;
        }


        return count==0;
    }
}
