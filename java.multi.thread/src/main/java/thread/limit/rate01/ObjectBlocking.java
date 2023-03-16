package thread.limit.apiexam1;

import lombok.extern.slf4j.Slf4j;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * 지정된 시간만큼 wait 하고 wakeup 하는 오브젝트
 * - wait 객체에 시간설정을 하지 않고 무한정 대기
 * - Timer scheduler 를 사용하여 특정 시간이 지나면 wait 객체를 wakeup 한다.
 *
 * @author skan
 * @since 2022/03/28
 */
@Slf4j
public class ObjectBlocking {

    public static final Object THREAD_OBJECT = new Object();

    // 시작 시간
    private long startTimeMil;

    // 이전 시작 시간
    private long beforeTimeMil;

    // 기준 대기시간
    private final long criteriaTimeMil;

    //
    private long count;


    public ObjectBlocking(int i, UnitType unitType) {
        this.criteriaTimeMil = waitingTime(i, unitType);
        this.startTimeMil = System.currentTimeMillis();
    }

    // delay time 을 계산하기 위한 단위
    public enum UnitType {
        MICROSECOND,
        SECOND,
        MINUTE,

    }

    /**
     * @param serverName 서버이름 입력
     * @throws InterruptedException
     */
    public void objectBlocking(String serverName) throws InterruptedException {

        synchronized (THREAD_OBJECT) {
            long currentTimeMil = System.currentTimeMillis();
            long estimateTime = criteriaTimeMil * count;      // 예상시간 (기준시간*카운트)
            long elapseTime = currentTimeMil - startTimeMil ; // 경과시간  (시작시간-현재시간)


            if (criteriaTimeMil > elapseTime) {  // ( 예산시간 > 경과시간[첫시작으로부터 시간])
                long waitTime = criteriaTimeMil - elapseTime;
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        synchronized (THREAD_OBJECT) {
                            //log.warn("2. {} thread wake up!!! - complete!! ", serverName);
                            THREAD_OBJECT.notify();

                        }
                    }
                }, waitTime);
                log.info(" 순서 : {}, 경과시간: {}  대기사간: {}", count, elapseTime, waitTime);
                //log.warn("1. {} thread sleep - order !! ", serverName);
                THREAD_OBJECT.wait();
            } else {
                log.info(" 순서 : {}, 경과시간: {} ", count, elapseTime);
            }
            startTimeMil = System.currentTimeMillis();
            count += 1;

        }

    }

    /**
     * 사용 제한 헤더 에따른 지연(대기) 시간 계산
     */
    protected long waitingTime(long value, UnitType unitType) {

        return switch (unitType) {
            case MICROSECOND -> value * 100;
            case SECOND -> value * 1000;
            case MINUTE -> value * 60000;
            default -> throw new IllegalStateException("Unexpected value: " + unitType);
        };
    }


}
