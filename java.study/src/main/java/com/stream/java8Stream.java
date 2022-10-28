package com.stream;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/05/27
 */
public class java8Stream {

    /**
     * min, max 테스트
     *  1. String 값을 map or mapToInt 를 사용하여 int Stream 으로 변경 한다.
     *  2. max, min 스트림을 사용하여 값을 추출한다.
     */
    public void StreamMax() {
        String text = "1,2,3,4,5";

        Stream.of(text.split(",")).collect(Collectors.toList()).forEach(System.out::print);
        Arrays.stream(Stream.of(text.split(",")).toArray()).forEach(System.out::print);

        Supplier<IntStream> supplier = ()-> Stream.of(text.split(",")).mapToInt(Integer::parseInt);
        System.out.println("max = " + supplier.get().max().orElse(-1));
        System.out.println("min = " + supplier.get().min().orElse(-1));

        int max = Stream.of(text.split(",")).map(Integer::parseInt).collect(Collectors.toList())
                .stream().max(Integer::compareTo).orElse(-1);
        System.out.println("max = " + max);

        int min = Stream.of(text.split(",")).map(Integer::parseInt).collect(Collectors.toList())
                .stream().min(Integer::compareTo).orElse(-1);

        System.out.println("min = " + min);


    }
}
