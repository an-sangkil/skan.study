package thread;

import java.time.LocalTime;
import java.util.concurrent.*;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @since 2021-03-04
 */
public class FutureTaskWebCrawlerTest {

    public static void main(String[] args) throws Exception {
        FutureTaskWebCrawlerTest futureTaskWebCrawlerTest = new FutureTaskWebCrawlerTest();
        futureTaskWebCrawlerTest.futureTaskExceptionTest(2,1);
        futureTaskWebCrawlerTest.futureTaskExceptionTest(3,1);
    }

    public void futureTaskExceptionTest (int sleepTime, int waitingTime) throws ExecutionException, InterruptedException, TimeoutException {
        FutureTask futureTask = new FutureTask(() -> {
            System.out.println("future task start");
            TimeUnit.SECONDS.sleep(sleepTime);
            System.out.println(LocalTime.now() + " Exiting runnable");
            return "SUCCESS";
        });

        try {
            ExecutorService executors  = Executors.newCachedThreadPool();
            executors.execute(futureTask);
            String result = (String) futureTask.get(waitingTime, TimeUnit.SECONDS);
            System.out.println("result = " + result);
        }catch (TimeoutException e) {
            System.out.println("시간이 초과 되었습니다. ");
        }
    }

    public void plainFutureTask () throws  Exception {
        FutureTask futureTask = new FutureTask(() -> {
            System.out.println("future task start");
            Thread.sleep(4000);
            System.out.println(LocalTime.now() + " Exiting runnable");
            return "SUCCESS";
        });

        futureTask.run();
        // 2 초간 기다리기 응답이 없으면 오류 .
        String result = (String) futureTask.get(2, TimeUnit.SECONDS);
        System.out.println("result = " + result);
    }
}
