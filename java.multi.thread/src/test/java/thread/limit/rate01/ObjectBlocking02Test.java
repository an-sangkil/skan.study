package thread.limit.rate01;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import thread.limit.rate01.ObjectBlocking;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 *
 * @author skan
 * @since 2022/03/28
 */
public class ObjectBlocking02Test {

    /**
     * 5초마다 API를 호출할수 있는 bucket
     * 예시)
     *  (1) 실행시간이 4초이면 1초간 대기한다.
     *  (2) 실생시간이 5초이상이면 대이 없음.
     *  (3) 실행시간이 3초면 2초간 대기한다.
     *    -> 이전 시간으로부터 현재시간의 타임이 기준시간인 (5초) 보다 작으면 wait() 한다.
     */
    @Test
    @DisplayName("하나의 인스턴스만 테스트")
    public void testObjectBlocking() {

        // RateLimiter 설정 (5, 초)  -> 5초 대기
        ObjectBlocking objectBlocking01 = new ObjectBlocking(5, ObjectBlocking.UnitType.SECOND);
        IntStream.rangeClosed(1,10).forEach(value -> {
            try {

                Random random = new Random();
                int randomVal = random.nextInt(1, 3) + 1;
                TimeUnit.SECONDS.sleep(randomVal);

                // 서버명을 입력
                objectBlocking01.objectBlocking("TEST-SERVER");

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }


}