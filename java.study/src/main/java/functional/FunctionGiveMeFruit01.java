package functional;

import functional.model.Apple;
import functional.model.Fruit;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/06/24
 */
public class FunctionGiveMeFruit01 {

    static Map<String, Function<Integer, Fruit>>  map = new HashMap<>();

    {
        map.put("apple", Apple::new);
    }

    public static Fruit giveMeFruit(String fruit, int weight) {
        return map.get(fruit)
                .apply(weight);
    }

    public static void main(String[] args) {

        FunctionGiveMeFruit01 functionGiveMeFruit = new FunctionGiveMeFruit01();
        Fruit fruit = FunctionGiveMeFruit01.giveMeFruit("apple", 1);
        System.out.println(fruit);

    }

}
