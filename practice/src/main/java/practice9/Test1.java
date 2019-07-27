package practice9;

import java.util.Scanner;

import static java.lang.Double.min;

/**
 * Author:li_d
 * Created:2019/7/27
 */
public class Test1 {
    public static int minDistance1(String word1, String word2) {
        if(word1==null||word2==null){
            return word1.length()+word2.length();
        }
        char[] words1 = word1.toCharArray();
        char[] words2 = word2.toCharArray();
        int len1 = words1.length;
        int len2 = words2.length;

        int[][] arr = new int[len1+1][len2+1];
        for(int i = 0;i<=len1;i++){
            for(int j = 0;j<=len2;j++){
                if(i==0||j==0){
                    arr[i][j] = i+j;
                    continue;
                }
                arr[i][j] = Math.min(arr[i-1][j]+1,arr[i][j-1]+1);
                arr[i][j] = Math.min(arr[i][j],(words1[i-1]==words2[j-1]?0:1)+arr[i-1][j-1]);
            }
        }
        return arr[len1][len2];
    }

    public static int minDistance(String word1, String word2) {
        if(word1 == null || word2 == null){
            return word1.length()+word2.length();
        }
        int len1 = word1.length();
        int len2 = word2.length();
        char[] words1 = word1.toCharArray();
        char[] words2 = word2.toCharArray();
        int[][] arr = new int[len1+1][len2+1];
        for(int i = 0;i < len1;i++){
            arr[i][0] = i;
        }
        for(int i = 0;i < len2;i++){
            arr[0][i] = i;
        }
        for(int i = 1;i < len1;i++) {
            for (int j = 1; j < len2; j++) {
                arr[i][j] = Math.min(arr[i - 1][j] + 1, Math.min(arr[i][j - 1] + 1, arr[i - 1][j - 1] + (words1[i] == words2[j] ? 0 : 1)));
            }
        }
        return arr[len1][len2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println(minDistance(str1,str2));
        }
    }
}
