package thread.blocking;

import junit.framework.TestCase;
import org.junit.Test;
import thread.blocking.api.ObjectApi01;
import thread.blocking.api.ObjectApi02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/03/28
 */
public class ObjectBlocking01Test {

    ObjectBlocking01 objectBlocking01 = new ObjectBlocking01();
    ObjectApi01 objectApi01 = new ObjectApi01();
    ObjectApi02 objectApi02 = new ObjectApi02();

    @Test
    public void testObjectBlocking() {

        IntStream.rangeClosed(50,55).forEach(value -> {
            try {
                objectBlocking01.objectBlocking("test", value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void testCaseAPI() throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable r1 = ()->{
            try {
                objectApi01.send();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable r2 = ()-> {
            try {
                objectApi02.send();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        executorService.submit(r1);
        executorService.submit(r2);

        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);


    }
}