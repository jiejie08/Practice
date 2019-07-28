package practice9;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/28
 */
public class Test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            int n = sc.nextInt();
            for(int i = 0;i < n;i++){
                int s = sc.nextInt();
                int e = sc.nextInt();
                String str1 = str.substring(0,s+e);//s+e是因为在子串原来位置的正后放插入逆置的
                String str2 = str.substring(s,e+s);
                String str3 = str.substring(e+s,str.length());
                StringBuffer stringBuffer = new StringBuffer(str2);
                stringBuffer.reverse();
                StringBuffer stringBuffer1 = new StringBuffer();
                stringBuffer1.append(str1);
                stringBuffer1.append(stringBuffer);
                stringBuffer1.append(str3);
                str = stringBuffer1.toString();
            }
            System.out.println(str);
        }
    }
}
