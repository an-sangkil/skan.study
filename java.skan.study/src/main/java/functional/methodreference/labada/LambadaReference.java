package functional.methodreference.labada;


import functional.model.Apple;

import java.util.Arrays;
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
 * @since 2022/06/13
 */
public class LambadaReference {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple("GREEN", 100),
                new Apple("GREEN", 250),
                new Apple("GREEN", 200),
                new Apple("GREEN", 350),
                new Apple("GREEN", 300));

        // 1.클레스 상속 순방향 정렬
        inventory.sort(new AppleComparable());
        System.out.println(inventory);

        // 2.익명함수 사용한 순방정렬
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });

        // 3. 람다식을 이용한 역정렬
        Comparator<Apple> appleComparator = (o1, o2) -> o2.getWeight() - o1.getWeight();
        inventory.sort(appleComparator);
        System.out.println(inventory);

        // 4. 메소드 참조를 이용한 순방향 정렬
        inventory.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(inventory);
    }
}

class AppleComparable implements Comparator<Apple> {

    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getWeight()- o2.getWeight();
    }
}
