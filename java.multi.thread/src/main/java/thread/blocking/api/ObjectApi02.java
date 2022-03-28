package thread.blocking.api;

import lombok.extern.slf4j.Slf4j;
import thread.blocking.ObjectBlocking01;

import java.util.Random;

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
@Slf4j
public class ObjectApi02 {

    public void send() throws InterruptedException {
        ObjectBlocking01 objectBlocking01 = new ObjectBlocking01();
        Random r = new Random();
        boolean expectedValue = r.nextBoolean();
        log.debug("expected value = {}", expectedValue);
        if (true) {
            for (int i = 0; i < 2; i++) {
                objectBlocking01.objectBlocking("service-02", 50);
            }
        }
    }
}
