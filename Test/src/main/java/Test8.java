/**
 * Author:li_d
 * Created:2019/8/11
 */
class MyThread implements Runnable{

    public void run() {
            synchronized (this){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
    }
}
public class Test8 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt,"a");
        Thread t2 = new Thread(mt,"b");
        Thread t3 = new Thread(mt,"c");
        t1.start();
        t3.start();
        t2.start();
    }
}
