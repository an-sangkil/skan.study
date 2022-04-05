package thread.blocking.api;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/04/04
 */
public class ObjectApiTest {

    ObjectBlocking objectBlocking01 = new ObjectBlocking();
    ObjectApi.ObjectApi01 objectApi01 = new ObjectApi.ObjectApi01();
    ObjectApi.ObjectApi02 objectApi02 = new ObjectApi.ObjectApi02();

    @Test
    @DisplayName("하나의 인스턴스만 테스트")
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
    @DisplayName("두개의 인스턴스 테스트")
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