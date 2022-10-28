package com.stream;

import org.junit.jupiter.api.Test;

/**
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/05/24
 */
class Java8OptionalTest {
    final Java8Optional java8Optional = new Java8Optional();

    @Test
    void nullCheck_ofnullable() {
        java8Optional.nullCheck01();
    }

    @Test
    void nullCheck_of() {
        java8Optional.nullCheck02();
    }

    @Test
    void nullCheck() {
        java8Optional.nullCheck03();
    }
}