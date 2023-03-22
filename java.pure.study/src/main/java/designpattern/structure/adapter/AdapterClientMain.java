package designpattern.structure.adapter;

import java.util.List;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2023 by CJENM|MezzoMedia. All right reserved.
 * @since 2023/01/10
 */
public class AdapterClientMain {

    public static void main(String[] args) {

        List <Animal> animalList =
                List.of(
                        new Lion("포세이돈"),
                        new Tiger("산이"),
                        new CatAdapter(new Cat("뾰뿅"))
                );

        animalList.forEach(animal -> {
            animal.walk();
            animal.sound();

        });
    }
}
