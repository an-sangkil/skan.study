package thread.blocking.api;

import lombok.extern.slf4j.Slf4j;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 지정된 시간만큼 wait 하고 wakeup 하는 오브젝트
 *     - wait 객체에 시간설정을 하지 않고 무한정 대기
 *     - Timer scheduler 를 사용하여 특정 시간이 지나면 wait 객체를 wakeup 한다.
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/03/28
 */
@Slf4j
public class ObjectBlocking {

    public static final Object THREAD_OBJECT = new Object();

    /**
     *
     * @param serverName         서버이름 입력
     * @param time               밀리 세컨드 단위의 시간 입력
     * @throws InterruptedException
     */
    public void objectBlocking(String serverName, int time) throws InterruptedException {

        synchronized (THREAD_OBJECT) {
            long delayTime = waitingTimeRpm(time);
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    synchronized (THREAD_OBJECT) {
                        log.warn("2. {} thread wake up!!! - complete!! ", serverName);
                        THREAD_OBJECT.notify();
                    }
                }
            }, delayTime);

            log.warn("1. {} thread sleep - order !! ", serverName);
            THREAD_OBJECT.wait();
        }

    }
    /**
     * 사용 제한 헤더 에따른 지연(대기) 시간 계산
     */
    protected long waitingTimeRpm(int acc_id_util_pct) {
        long _return = 0;
        if (acc_id_util_pct >= 100) {
            return 1000 * 300;

        } else if (acc_id_util_pct >= 90) {
            return 1000 * 170;

        } else if (acc_id_util_pct >= 80) {
            return 1000 * 120;

        } else if (acc_id_util_pct >= 70) {
            return 1000 * 30;

        } else if (acc_id_util_pct >= 50) {
            return 1000 * 10;
        }

        return _return;

    }

}
