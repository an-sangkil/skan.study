package thread.blocking;

import lombok.extern.slf4j.Slf4j;

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
public class ObjectBlocking02 {

    long currentMillis;
    int counter;

    public enum Per {
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY
    }

    public ObjectBlocking02(long standardTimeMillis, Per per) {
        switch (per) {
            case SECOND:
                currentMillis = standardTimeMillis * 1000;
                break;
            case MINUTE:
                currentMillis = standardTimeMillis * 60000;
                break;
            case HOUR:
                currentMillis = standardTimeMillis * 3600000;
                break;
            case DAY:
                currentMillis = standardTimeMillis * 86400000;
                break;
        }
    }

    public synchronized void blocking() throws InterruptedException {

        counter += 1;
        log.debug(String.format("counter: %3d, waited: %d ", counter,  currentMillis ));
        wait(currentMillis);
    }

    public synchronized void wakeup() {
        notifyAll();
    }

}


@Slf4j
class ObjectSDK {
    ObjectBlocking02 objectBlocking02 = new ObjectBlocking02(3, ObjectBlocking02.Per.SECOND);

    public void submit(int value) {
        try {
            log.debug("value count = {}", value);
            objectBlocking02.blocking();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
