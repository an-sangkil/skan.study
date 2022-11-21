package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * submit 으로 리턴밭은 비동기 수행 결과값을 저장할때 Future와 callback 을 사용한다.
 * FutureTask 는 future 를 객체화 시킬수있다.
 *
 */
public class FutureTaskExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = Executors.newCachedThreadPool();
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            Thread.sleep(2000);
            System.out.println("async");
            return "SUCCESS";
        });

        service.execute(futureTask);

        System.out.println(futureTask.isDone());
        Thread.sleep(3000);
        System.out.println("exit");
        System.out.println(futureTask.isDone());
        System.out.println(futureTask.get());

    }
}
