package designpattern.factory.methodfactory.ex2;

/**
 *
 * @author skan
 * @since 2022/12/06
 */
public class LongSword implements Item {
    @Override
    public void use() {
        System.out.println("long sword 를 사용 합니다.");
    }
}
