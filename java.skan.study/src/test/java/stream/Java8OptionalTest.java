package stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/05/24
 */
class Java8OptionalTest {
    final Java8Optional java8Optional = new Java8Optional();

    @Test
    void nullCheck() {
        java8Optional.nullCheck01();
        java8Optional.nullCheck02();
        java8Optional.nullCheck03();
    }
}