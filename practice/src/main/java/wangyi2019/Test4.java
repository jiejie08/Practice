package wangyi2019;

/**
 * Author:li_d
 * Created:2019/8/3
 */
/*
又到了周末，小易的房间乱得一团糟。
他希望将地上的杂物稍微整理下，使每团杂物看起来都紧凑一些，没有那么乱。
地上一共有n团杂物，每团杂物都包含4个物品。第i物品的坐标用(ai,bi)表示，小易每次都可以将它绕着(xi,yi)逆时针旋转，这将消耗他的一次移动次数。如果一团杂物的4个点构成了一个面积不为0的正方形，我们说它是紧凑的。
因为小易很懒，所以他希望你帮助他计算一下每团杂物最少需要多少步移动能使它变得紧凑。
 */
/*
说明：对于第一团杂物，我们可以旋转第二个或者第三个物品1次
 */

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[][][] abxy=new int[n][4][4];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<4;j++){
//                abxy[i][j][0]=sc.nextInt();
//                abxy[i][j][1]=sc.nextInt();
//                abxy[i][j][2]=sc.nextInt();
//                abxy[i][j][3]=sc.nextInt();
//            }
//        }
//        for(int index=0;index<n;index++){
//            int min=Integer.MAX_VALUE;
//            for(int i=0;i<4;i++){
//                for(int j=0;j<4;j++){
//                    for(int k=0;k<4;k++){
//                        for(int m=0;m<4;m++){
//                            if(isSquare(rotate(abxy[index][0],i),rotate(abxy[index][1],j),rotate(abxy[index][2],k),rotate(abxy[index][3],m))){
//                                min=Math.min(min,i+j+k+m);
//                            }
//                        }
//                    }
//                }
//            }
//            if(min==Integer.MAX_VALUE){
//                min=-1;
//            }
//            System.out.println(min);
//        }
//    }
//    //绕xy旋转count次 point长度为4，固定这个长度是因为这样在调用的时候比较方便
//    public static  int[] rotate(int[] point,int count){
//        int[] res=new int[] {point[2]+point[3]-point[1], point[3]-point[2]+point[0],point[2],point[3]};
//        if(count==0){
//            return point;
//        }else{
//            return rotate(res,count-1);
//        }
//    }
//    //判定正方形，一定要判定两个对角边是否相等
//    public static  boolean isSquare(int[] point1,int[] point2,int[] point3,int[] point4){
//        double[] sideLen=new double[]{distance(point1,point2),distance(point2,point3),
//                distance(point3,point4),distance(point4,point1),distance(point1,point3),distance(point2,point4)};
//        Arrays.sort(sideLen);
//        return sideLen[0] != 0&&sideLen[0]==sideLen[1]&&sideLen[1]==sideLen[2]&&sideLen[2]==sideLen[3]&&
//                sideLen[3]==sideLen[0]                &&sideLen[4]==sideLen[5];
//    }     private static double distance(int[] fromPoint, int[] toPoint) {
//        return Math.pow(fromPoint[0] - toPoint[0], 2)+ Math.pow(fromPoint[1] - toPoint[1], 2);
//    }
//}

public class Test4 {
}
