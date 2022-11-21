package thread.coffee;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 *
 * @author skan
 * @since 2022/11/17
 */
public class UserClient {

    private int index = 1;
    ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) throws Exception {
        UserClient userClient = new UserClient();
        //System.out.println("-----------------------------------------");
        //userClient.getCoffee();
        //System.out.println("-----------------------------------------");
        //userClient.getCoffeeBlocking();
        //System.out.println("-----------------------------------------");
        userClient.getCoffeeNonblocking();
    }

    public void getCoffee() throws Exception{
        CafeService service = new CafeService();
        System.out.println("1. 커피주문 Blocking");
        System.out.println("2. Blocking");
        CoffeeEntity coffeeEntity = service.getCoffee("아메", 1000L);
        System.out.println("3. blocking :" + coffeeEntity);
        System.out.println("4. other job");
        System.out.println("5. END");
    }

    /**
     * Thread를 사용함으로 Non-blocking 같지만
     *  futureTask.get() 을 사용함으로 중간에 blocking이 된다.
     * @throws Exception
     */
    public void getCoffeeBlocking() throws Exception{
        System.out.println("1. 커피주문 Nonblocking - blocking");
        CafeService service = new CafeService();
        System.out.println("2. Nonblocking - blocking");

        FutureTask<CoffeeEntity> futureTask = new FutureTask<>(()-> service.getCoffee("라때",2000L));
        Thread thread = new Thread(futureTask);
        thread.start();

        while (!futureTask.isDone()) {
            System.out.printf("3. other job %d \n", index++);
            Thread.sleep(500);

        }
        System.out.println("4. blocking : " +futureTask.get());
        System.out.println("5. other job");
        System.out.println("6. end");


    }

    /**
     * Thread 를 사용하고 Non-blocking 하게 동작한다.
     * 이유는 get() 을할때 callback 으로 실행되기 때문이다.
     * @throws Exception
     */
    public void getCoffeeNonblocking() throws Exception{
        System.out.println("1. 커피주문 Nonblocking");
        CafeService service = new CafeService();
        FutureTask<CoffeeEntity> coffeeEntityFutureTask = new FutureTask<>(() -> service.getCoffee("라때",3000L))
        {
            @Override
            public void done() {
                try {
                    System.out.println("3. callback data : " + this.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        };
        System.out.println("2. Nonblocking");
        executorService.execute(coffeeEntityFutureTask);
        executorService.shutdown();

        while (!coffeeEntityFutureTask.isDone()) {
            System.out.printf("4. other job %d \n", index ++);
            Thread.sleep(500);
        }

        System.out.println("5. END");
    }
}
