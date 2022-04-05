package thread.blocking;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * 지정된 시간만큼 wait 하고 wakeup 하는 오브젝트
 *  - 지정된 시간만큼 wait 메소드를 이용하여 객체를 대기상태로 만들고, 지정된 시간이 지나면 자동으로 wakeup 된다.
 *  - counter 를 이용하여, 현재 몇번째 재호출이 일어나는지 확인한다.
 *
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/03/28
 */
@Slf4j
public class RateWaiter01 {

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

    public RateWaiter01(long standardTimeMillis, Per per) {
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
    RateWaiter01 objectBlocking02 = new RateWaiter01(3, RateWaiter01.Per.SECOND);

    public void submit(int value) {
        try {
            log.debug("value count = {}", value);
            objectBlocking02.blocking();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
