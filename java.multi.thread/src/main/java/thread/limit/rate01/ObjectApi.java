package thread.limit.apiexam1;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * ObjectApi01, ObjectApi02 에서 동시에 새로운 인스턴스로 호출시 정상동작하는지 테스트하기 위함
 * {@link ObjectBlocking#objectBlocking(String, int)} 을 테스트하기 위함.
 *
 *
 *  @see ObjectBlocking#objectBlocking(String, int)
 *
 *
 * @author skan
 * @version Copyright (C) 2022 by . All right reserved.
 * @since 2022/04/04
 */
public class ObjectApi {

    @Slf4j
    public static class ObjectApi01 {

        public void send() throws InterruptedException {
//            ObjectBlocking objectBlocking01 = new ObjectBlocking();
//            Random r = new Random();
//            boolean expectedValue = r.nextBoolean();
//            log.debug("expected value = {}", expectedValue);
//            if (true) {
//                for (int i = 0; i < 2; i++) {
//                    //objectBlocking01.objectBlocking("service-01", 50);
//                }
//            }
        }
    }

    @Slf4j
    public static class ObjectApi02 {

        public void send() throws InterruptedException {
//            ObjectBlocking rateWaiter01 = new ObjectBlocking();
//            Random r = new Random();
//            boolean expectedValue = r.nextBoolean();
//            log.debug("expected value = {}", expectedValue);
//            if (true) {
//                for (int i = 0; i < 2; i++) {
//                    //rateWaiter01.objectBlocking("service-02", 50);
//                }
//            }
        }
    }



}



