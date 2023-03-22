package datetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2023 by CJENM|MezzoMedia. All right reserved.
 * @since 2023/03/22
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {

        // 로컬데이트 1일전 데이터
        LocalDateTime localDateTime = LocalDateTime.now().minus(1, ChronoUnit.DAYS);
        System.out.println(localDateTime);
    }
}
