package thread.blocking;

import org.junit.Test;

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
 * @version Copyright (C) 2022 by  All right reserved.
 * @since 2022/04/04
 */
public class RateWaiter02Test {

    @Test
    public void blocking() {
        RateWaiter02 rateWaiter02 = new RateWaiter02(1, RateWaiter02.Per.SECOND);
        IntStream.rangeClosed(1,10).forEach(value -> {
            try {
                rateWaiter02.blocking(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
    }
}