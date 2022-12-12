package designpattern.factory.methodfactory.ex2;

/**
 *
 * @author skan
 * @since 2022/12/06
 */
public class Wand implements Item {
    @Override
    public void use() {
        System.out.println("wand 를 사용합니다.");
    }
}
