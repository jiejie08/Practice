package practice2;

import java.util.Scanner;

/**
 * Author:li_d
 * Created:2019/7/25
 */
public class Test1 {
        public static boolean isHuiwei(String s){
            char[] chars = s.toCharArray();
            int start = 0;
            int end = chars.length-1;
            while (start < end){
                if (chars[start] != chars[end]){
                    return false;
                }else{
                    start++;
                    end--;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int count = 0;
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()){
                String str1 = scanner.next();
                String str2 = scanner.next();
                for (int i = 0;i <= str1.length();i++){
                    StringBuffer str3 = new StringBuffer(str1);
                    StringBuffer newstr = str3.insert(i,str2);
                    if(isHuiwei(newstr.toString())){
                        count++;
                    }
                }
                System.out.println(count);
                count = 0;
            }
        }

}
