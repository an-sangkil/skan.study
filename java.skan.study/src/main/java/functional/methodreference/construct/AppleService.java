package functional.methodreference.construct;

import java.util.function.Supplier;

public class AppleService {
    void getOne(Supplier<Apple> apple) {

        System.out.println(apple.get());

    }
}
