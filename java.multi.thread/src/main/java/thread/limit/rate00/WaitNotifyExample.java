package thread.limit.rate01;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer 를 사용한 Object : wait(), notify() 예제
 */
public class WaitNotifyExample {

    private String serverName;
    private final Object lock = new Object();

    public WaitNotifyExample(String serverName) {
        this.serverName = serverName;
    }

    public void start(long waitTime) {

        // 동기화 블록 안에서 wait, notify 해주어야 한다.
        synchronized (lock) {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    synchronized (lock) {
                        System.out.println("2. " + serverName + " thread wake up!!! - complete!!");
                        lock.notifyAll();
                    }
                }
            }, waitTime);
            try {
                System.out.println("1. " + serverName + " thread wait...");
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("3. " + serverName + " thread finished");
            timer.cancel();
        }
    }

    public static void main(String[] args) {
        WaitNotifyExample example1 = new WaitNotifyExample("Server 1");
        WaitNotifyExample example2 = new WaitNotifyExample("Server 2");
        example1.start(3000);
        example2.start(5000);
    }
}