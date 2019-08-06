package practice10;

/**
 * Author:li_d
 * Created:2019/8/1
 */
public class Test2 {
    public static void main(String args[]) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
    System.out.print("ping");
    }
    static void pong() {
        System.out.print("pong");
    }
}
