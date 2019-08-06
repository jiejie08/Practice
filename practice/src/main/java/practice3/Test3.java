package practice3;

import java.util.Scanner;
import java.util.Stack;

/**
 * Author:li_d
 * Created:2019/7/24
 */
public class Test3 {
    public static boolean chkParenthesis(String A, int n) {
        if(n <= 0 || n % 2 != 0){
            return false;
        }
        Stack stack = new Stack();
        for(int i = 0;i < n;i++){
            if (A.charAt(i) == '('){
                stack.push(A.charAt(i));
            } else if (A.charAt(i) == ')'){
                if (stack.isEmpty()){
                    return false;
                }else {
                    stack.pop();
                }
            }else {
                return false;
            }
        }
        if (stack.isEmpty()){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            int n = str.length();
            System.out.println(chkParenthesis(str,n));
        }
    }

}
