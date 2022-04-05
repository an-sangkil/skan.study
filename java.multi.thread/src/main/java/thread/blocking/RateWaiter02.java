package thread.blocking;

import lombok.extern.slf4j.Slf4j;

/**
 * 지정된 시간만큼 wait 하고 wakeup 하는 오브젝트
 * - 지정된 시간만큼 wait 메소드를 이용하여 객체를 대기상태로 만들고, 지정된 시간이 지나면 자동으로 wakeup 된다.
 * - counter 를 이용하여, 현재 몇번째 재호출이 일어나는지 확인한다.
 *
 * @author skan
 * @version Copyright (C) 2022 by |. All right reserved.
 * @since 2022/03/28
 */
@Slf4j
public class RateWaiter02 {


    public enum Per {
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY
    }

    private long count;
    private Per unit;

    private double rpm;
    private long counter;
    private long startMillis;

    /**
     * rpm 생성기
     * {@link RateWaiter02#RateWaiter02(long, Per)} count argument 값에 따라 rpm 이 조절된다.
     * {@code
     * new RateWaiter02(1, SECOND);  초당 딜레이시간 기본 1초
     * new RateWaiter02(2, SECOND);  초당 딜레이시간 기본 2초
     * }
     *
     * @param count rpm 을 미세 조정 하는 숫자,
     * @param unit
     */
    public RateWaiter02(long count, Per unit) {

        this.count = count;
        this.unit = unit;
        this.startMillis = System.currentTimeMillis();
        this.counter = 0;

        switch (unit) {
            case MILLISECOND:
                rpm = count * 100;
                break;
            case SECOND:
                rpm = count * 1000;
                break;
            case MINUTE:
                rpm = count * 60000;
                break;
            case HOUR:
                rpm = count * 3600000;
                break;
            case DAY:
                rpm = count * 86400000;
                break;
        }
    }


    public synchronized double blocking(int delta) throws InterruptedException {

        long oldCounter = counter;                                     // 카운터
        long currentMillis = System.currentTimeMillis();                // 현재 시간
        long expectMillis = (long) (counter * rpm);                     // 예상 경과시간
        long elapseMillis = currentMillis - startMillis;                // 실제 경과시간

        double retVal = 0;

        // 예상경과 시간이 > 실제경과 시간보다 크면강제로 기다리게 한다.
        //   - 실제 경과시간이 빠르게 지나가면 예상시산에 한번 호출될게 여러번 호출되기 때문이다.
        if (expectMillis > elapseMillis) {
            counter += delta;
            long waitTime = expectMillis - elapseMillis; //예상경과시간 - 실제 경과시간
            wait(waitTime);
            elapseMillis = System.currentTimeMillis() - startMillis; // 실제 경과 시간을 다시 계산한다.
            retVal = (double) oldCounter / (double) elapseMillis;
            log.debug(String.format("counter: %3d, elapse: %5d, waited: %d retval: %s ", oldCounter, elapseMillis, waitTime, retVal));
        } else {
            retVal = (double) oldCounter / (double) elapseMillis;
            log.debug(String.format("counter: %3d, elapse: %5d retval: %s", oldCounter, elapseMillis,retVal));
            counter = delta;
            startMillis = currentMillis;
        }

        return retVal;
    }

    public double blocking() throws InterruptedException {
        return this.blocking(0);
    }

    public synchronized void wakeup() {
        notifyAll();
    }

}

