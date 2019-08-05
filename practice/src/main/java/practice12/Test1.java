package practice12;

/**
 * Author:li_d
 * Created:2019/8/3
 */
/*
格雷编码
 */
public class Test1 {
    public String[] getGray(int n) {
        // write code here
        String[] str = null;//最终的结果都要返回str
        if( n == 1){
            str = new String[]{"0", "1"};
        }else{
            String[] strs = getGray(n-1);
            str = new String[2*strs.length];
            for (int i = 0;i < strs.length;i++){
                str[i] = "0" + strs[i];//正着加0
                str[str.length - 1 -i] = "1" + strs[i];//反着加1
            }
        }
        return str;
    }
}
