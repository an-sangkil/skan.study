package thread.blocking;

import lombok.val;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import thread.limit.apiexam1.ObjectBlocking;
import thread.limit.rate01.ObjectSDK;

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

        ObjectBlocking objectBlocking01 = new ObjectBlocking(5, ObjectBlocking.UnitType.SECOND);
        IntStream.rangeClosed(1,10).forEach(value -> {
            try {

                Random random = new Random();
                int randomVal = random.nextInt(1, 5) + 1;
                TimeUnit.SECONDS.sleep(randomVal);
                objectBlocking01.objectBlocking("test");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }


}