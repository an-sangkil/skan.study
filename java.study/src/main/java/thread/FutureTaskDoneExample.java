package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * submit 으로 리턴밭은 비동기 수행 결과값을 저장할때 Future와 callback 을 사용한다.
 * FutureTask 는 future 를 객체화 시킬수있다.
 */
public class FutureTaskDoneExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = Executors.newCachedThreadPool();
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            Thread.sleep(2000);
            System.out.println("async");
            return "SUCCESS";
        }) {
            // 익명클래스로 done() 메서드를 추가한 코드
            // 비동기 작업이 완료되면 호출되는 hook 혹은 callback 과 비슷한 기능.
            @Override
            protected void done() {
                try {
                    System.out.println(get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }

        };

        service.execute(futureTask);
        service.shutdown();
        System.out.println("exit");

    }
}
