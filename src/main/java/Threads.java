import java.io.FileInputStream;
import java.io.InputStream;

public class Threads {
    public static void main(String[] args) {

        Thread t1 = new Thread(Threads::task,"T1");
        Thread t2 = new Thread(Threads::task,"T2");
        Thread t3 = new Thread(Threads::task,"T3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main Thread");
        System.out.println("State 1 => " + t1.getState());
        System.out.println("Priority 2 => " + t2.getPriority());
        System.out.println("Priority 3 => " + t3.getPriority());

    }

    static void task(){

        for(int i =0;i<1;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
