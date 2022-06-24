package functional;

import functional.model.Apple;
import functional.model.Fruit;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
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
public class FunctionGiveMeFruit02 {

    static Map<String, BiFunction<Integer, String, Fruit>> map = new HashMap<>();

    {
        map.put("apple", Apple::new);
        map.put("orange", Apple::new);
    }

    public static Fruit giveMeFruit(String fruit, int weight,String clolor) {
        return map.get(fruit)
                .apply(weight,clolor);
    }

    public static void main(String[] args) {
        FunctionGiveMeFruit02 functionGiveMeFruit = new FunctionGiveMeFruit02();
        Fruit fruit = FunctionGiveMeFruit02.giveMeFruit("apple", 1,"red02");
        System.out.println(fruit);
        fruit = FunctionGiveMeFruit02.giveMeFruit("apple", 2,"red01");
        System.out.println(fruit);
        fruit = FunctionGiveMeFruit02.giveMeFruit("orange", 2,"주황");
        System.out.println(fruit);

    }

}
