package thread.limit.rate01;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import thread.limit.rate01.ObjectApi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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


    ObjectApi.ObjectApi01 objectApi01 = new ObjectApi.ObjectApi01();
    ObjectApi.ObjectApi02 objectApi02 = new ObjectApi.ObjectApi02();



    @Test
    @DisplayName("두개의 인스턴스 테스트")
    public void testCaseAPI() throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorService executorService02 = Executors.newFixedThreadPool(2);

        Runnable r1 = ()->{
            try {
                objectApi01.send();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Runnable r2 = ()-> {
            try {
                objectApi02.send();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        executorService.submit(r1);
        executorService.submit(r2);

        executorService.shutdown();
        executorService02.shutdown();

        // 작업이끝날때 까지 기다리도록함
        //  Long의 MAX 카운트 까지 (초)
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        executorService02.awaitTermination(Long.MAX_VALUE,TimeUnit.SECONDS);


    }

}