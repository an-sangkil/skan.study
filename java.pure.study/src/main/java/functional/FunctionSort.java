package functional;

import functional.model.Apple;

import java.util.Comparator;
import java.util.List;

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
public class FunctionSort {

    public static void main(String[] args) {
        List<Apple> inventory = new java.util.ArrayList<>(List.of(new Apple(1), new Apple(3), new Apple(7), new Apple(5), new Apple(2), new Apple(6), new Apple(4)));
        inventory.sort(Comparator.comparing(Apple::getWeight).reversed());
        inventory.forEach(System.out::println);

    }
}
