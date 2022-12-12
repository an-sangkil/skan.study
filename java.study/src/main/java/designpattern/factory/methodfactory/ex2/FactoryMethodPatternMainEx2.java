package designpattern.factory.methodfactory.ex2;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/07
 */
public class FactoryMethodPatternMainEx2 {

    public static void main(String[] args) {
        Item item;
        ItemFactory itemFactory = new ItemFactory();
        item = itemFactory.create(ItemFactory.ItemType.AXE);
        item.use();

        item = itemFactory.create(ItemFactory.ItemType.SWORD);
        item.use();

        item = itemFactory.create(ItemFactory.ItemType.WAND);
        item.use();
    }
}
