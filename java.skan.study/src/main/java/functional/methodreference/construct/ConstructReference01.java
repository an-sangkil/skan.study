package functional.methodreference.construct;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Description : 생성자 참조
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/06/13
 */
public class ConstructReference01 {

    public static void main(String[] args) {

        // 기본 생성자 참조
        AppleService appleService = new AppleService();
        appleService.getOne(Apple::new);

        // 기본 생성자 참조
        Supplier<Apple> c1 = Apple::new;
        System.out.println("c1 : " + c1.get());

        // weight 생성자를 이용한 메소드 참조
        Function<Integer, Apple> c2 = Apple::new;
        Apple apple = c2.apply(110);
        System.out.println("c2 : " + apple);

        // 두개의 생성자를 가진 메소드 참조 > BiFunction 사용
        BiFunction<String,Integer,Apple> c3 = Apple::new;
        apple = c3.apply("GREEN",200);
        System.out.println("c3 : " + apple);

    }
}


