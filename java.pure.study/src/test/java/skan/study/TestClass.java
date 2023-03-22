package skan.study;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class TestClass {

    @Test
    public void test5() {
        System.out.println("test5");
    }

    @Test
    public void test3() {
        int a = 58;
        int b = 2;
        int c = 10;
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a % c);

        // 2% 마다 업데이트 하기
        IntStream.rangeClosed(1, 200).forEach(value -> {
            double percent_value = value / 200.0 * 100;
            if (percent_value % 2 == 0) {
                System.out.println(percent_value);
            }

        });

    }
}
