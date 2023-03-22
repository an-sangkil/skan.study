package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * submit 으로 리턴밭은 비동기 수행 결과값을 저장할때 Future와 callback 을 사용한다.
 */
public class FutureExample {

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        System.out.println("start");
        Future<String> future = service.submit(() -> {
            Thread.sleep(2000);
            System.out.println("async");
            return "SUCCESS";
        });

        while (!future.isDone()) {
            System.out.println("other job !");
            Thread.sleep(200);
        }
        System.out.println("exit");
        System.out.println(future.isDone());
        System.out.println(future.get());
        service.shutdown();

    }
}
