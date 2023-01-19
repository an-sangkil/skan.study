package designpattern.structure.flyweight;

/**
 *
 * @author skan
 * @since 2023/01/12
 */
public class FlyweightClientMain {

    public static void main(String[] args) {

        ItemFactory itemFactory = new ItemFactory();
        itemFactory.create("red","goliath");
        itemFactory.create("red","goliath");
        itemFactory.create("blue","goliath");
        itemFactory.create("silver","goliath");
        itemFactory.create("silver","goliath");
        itemFactory.create("silver","goliath");

    }
}
