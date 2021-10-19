package com.normal.collection;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021/10/12
 */
class NullAndEmptyTest {

    NullAndEmpty nullAndEmpty = new NullAndEmpty();
    @Test
    void emptyTest() {
        List<String> testData = List.of("a","b");
        nullAndEmpty.emptyTest(null);
        nullAndEmpty.emptyTest(testData);
        nullAndEmpty.emptyTest(List.of());
    }
}