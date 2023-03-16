package thread.limit.rate02;

import ch.qos.logback.core.util.TimeUtil;
import org.junit.jupiter.api.Test;

import java.util.Random;
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
 * @version Copyright (C) 2023 by CJENM|MezzoMedia. All right reserved.
 * @since 2023/03/16
 */
class RateWaiter02Test {

    RateWaiter02 rateWaiter02 = new RateWaiter02(2, RateWaiter02.Per.SECOND);

    @Test
    void blocking() {
        IntStream.rangeClosed(1, 10).forEach(value -> {
            try {

                // delta 를 조정하여 딜레이시간을 조정한디.
                Random random = new Random();
                int randomVal = random.nextInt(1,5)+1;
                TimeUnit.SECONDS.sleep(randomVal);
                rateWaiter02.limit(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
    }

}