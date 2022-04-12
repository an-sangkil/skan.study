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

    public enum Per {
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY
    }

    private long count;
    private RateWaiter01.Per unit;

    private double rpms;
    private long counter;
    private long startMillis;

    public RateWaiter01(long standardTimeMillis, Per per) {
        this.count = count;
        this.unit = unit;

        this.counter = 0;
        this.startMillis = System.currentTimeMillis();

        switch (unit) {
            case MICROSECOND:
                rpms = count * 1000.0;
                break;
            case MILLISECOND:
                rpms = count;
                break;
            case SECOND:
                rpms = count / 1000.0;
                break;
            case MINUTE:
                rpms = count / 60000.0;
                break;
            case HOUR:
                rpms = count / 3600000.0;
                break;
            case DAY:
                rpms = count / 86400000.0;
                break;
        }
    }

    public synchronized double blocking(int delta) throws InterruptedException {

        long oldCounter = counter;
        long curMillis = System.currentTimeMillis();
        long expectMillis = (long) (counter / rpms);
        long elapseMillis = curMillis - startMillis;

        double retVal = 0;

        // 전 실행 시간과 현재시간의 간격이, 예상 시간보다 작은경우, 강제로 기다리게한다.
        if (expectMillis > elapseMillis) {
            counter += delta;
            long waitTime = expectMillis - elapseMillis;
            wait(waitTime);
            elapseMillis = System.currentTimeMillis() - startMillis;
            retVal = (double) oldCounter / (double) elapseMillis;
            log.debug(String.format("counter: %3d, elapse: %5d, waited: %d ", oldCounter, elapseMillis, waitTime));
        } else {
            retVal = (double) oldCounter / (double) elapseMillis;
            log.debug(String.format("counter: %3d, elapse: %5d ", oldCounter, elapseMillis));
            counter = delta;
            startMillis = curMillis;
        }

        return retVal;
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
            objectBlocking02.blocking(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
