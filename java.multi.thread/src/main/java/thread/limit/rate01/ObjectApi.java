package thread.limit.rate01;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * ObjectApi01, ObjectApi02 에서 동시에 새로운 인스턴스로 호출시 정상동작하는지 테스트하기 위함
 * {@link ObjectBlocking#objectBlocking(String)} (String, int)} 을 테스트하기 위함.
 *  @see ObjectBlocking#objectBlocking(String)
 *
 *
 * @author skan
 * @version Copyright (C) 2022 by . All right reserved.
 * @since 2022/04/04
 */
public class ObjectApi {

    @Slf4j
    public static class ObjectApi01 {

        public void send() throws Exception {
            ObjectBlocking objectBlocking01 = new ObjectBlocking(1, ObjectBlocking.UnitType.SECOND);
            Random r = new Random();
            boolean expectedValue = r.nextBoolean();
            log.debug("expected value = {}", expectedValue);
            if (true) {
                for (int i = 0; i < 10; i++) {
                    objectBlocking01.objectBlocking("service-01");
                }
            }
        }
    }

    @Slf4j
    public static class ObjectApi02 {

        public void send() throws Exception {
            ObjectBlocking rateWaiter01 = new ObjectBlocking(2, ObjectBlocking.UnitType.SECOND);
            Random r = new Random();
            boolean expectedValue = r.nextBoolean();
            log.debug("expected value = {}", expectedValue);
            if (true) {
                for (int i = 0; i < 10; i++) {

                    rateWaiter01.objectBlocking("service-02");
                }
            }
        }
    }



}



