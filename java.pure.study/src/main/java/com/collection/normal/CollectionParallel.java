package com.collection.normal;

import java.util.stream.IntStream;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021-01-14
 */
public class CollectionParallel {

    public static void main(String[] args) {

        IntStream.range(0, 100)
                .parallel()
                .forEach(value -> {
                            String threadName = Thread.currentThread().getName();
                            System.out.println(threadName);
                        }
                );

    }
}
