package functional.methodreference.method;

import functional.methodreference.construct.Apple;

import java.util.function.*;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/06/13
 */
public class MethodReference {

    public static void main(String[] args) {

        // 스테틱 메소드 참조
        MethodService m1 = MethodServiceImpl::print;
        m1.doSomething(new Apple("RED",100));

        // 람다식
        MethodService m2 = apple -> new Apple("GREEN",300);
    }

    static class MethodServiceImpl {
        static public void print(Apple apple) {
            System.out.println(apple);
        }
    }
    interface MethodService {
        void doSomething(Apple apple);

    }
}
