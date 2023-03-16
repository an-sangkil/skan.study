package thread.limit.rate00;

import mulity.thread.custom.executer.ExternalService;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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

            // 사용완료후 타이머 쓰레드 종료
            timer.cancel();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WaitNotifyExample example1 = new WaitNotifyExample("Server 1");
        WaitNotifyExample example2 = new WaitNotifyExample("Server 2");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            example2.start(5000);
        });
        executorService.submit(() -> {
            example1.start(3000);
        });

        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);

    }
}