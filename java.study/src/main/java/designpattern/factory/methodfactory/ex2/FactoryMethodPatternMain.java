package designpattern.factory.methodfactory.ex2;

import designpattern.factory.methodfactory.ex2.frame.Factory;
import designpattern.factory.methodfactory.ex2.frame.Item;
import designpattern.factory.methodfactory.ex2.frame.ItemFactory;

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
public class FactoryMethodPatternMain {

    public static void main(String[] args) {
        Item item;
        ItemFactory itemFactory = new ItemFactory();
        item = itemFactory.create(Factory.ItemType.AXE);
        item.use();

        item = itemFactory.create(Factory.ItemType.SWORD);
        item.use();

        item = itemFactory.create(Factory.ItemType.WAND);
        item.use();
    }
}
