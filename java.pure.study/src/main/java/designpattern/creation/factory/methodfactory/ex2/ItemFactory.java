package designpattern.creation.factory.methodfactory.ex2;

/**
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/06
 */
public class ItemFactory extends Factory {

    @Override
    public Item createItem(ItemType itemType) {
        Item item;
        if (itemType == ItemType.AXE ){
            item =  new Axe();
        } else if (itemType == ItemType.SWORD) {
            item = new LongSword();
        } else if (itemType == ItemType.WAND) {
            item = new Wand();
        } else {
            throw new IllegalArgumentException("item type 이 정확하지 않습니다. ");
        }

        return item;
    }

    public enum ItemType {
        AXE,
        SWORD,
        WAND,
    }


}
