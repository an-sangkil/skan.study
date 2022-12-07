package designpattern.factory.methodfactory.ex2.frame;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/06
 */
public abstract class Factory {

    // 프로세스
    public Item create(ItemFactory.ItemType itemType) {

        this.validation(itemType);

        Item item = this.createItem(itemType);

        this.notification(item);

        return item;
    }

    // 아이템 생성
    abstract protected Item createItem(ItemFactory.ItemType itemType);


    private void validation(ItemFactory.ItemType itemType) {
        if (itemType== null) {
            throw  new IllegalArgumentException("아이템 타입을 선택해주세요.");
        }

    }

    final protected void notification (Item item) {
        System.out.println(item + " 이생성되었습니다.");
    }


}
