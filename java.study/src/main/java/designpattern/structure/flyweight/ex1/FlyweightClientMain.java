package designpattern.structure.flyweight.ex1;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author skan
 * @since 2023/01/12
 */
public class FlyweightClientMain {

    public static void main(String[] args) {

        String[] color = new String[]{"red", "blue", "silver"};
        Random random = new Random();

        ItemFactory itemFactory = new ItemFactory();
        IntStream.rangeClosed(0, 10).forEach(index -> {
            Unit unit = itemFactory.create(color[random.nextInt(3)] + "_goliath", "goliath");
            unit.position(Math.random(), Math.random());
        });


        IntStream.rangeClosed(0, 10).forEach(index -> {
            Unit unit = itemFactory.create(color[random.nextInt(3)] + "_marin", "marin");
            unit.position(Math.random(), Math.random());
        });

    }
}
