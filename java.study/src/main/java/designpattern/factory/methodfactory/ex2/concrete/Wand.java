package designpattern.factory.methodfactory.ex2.concrete;

import designpattern.factory.methodfactory.ex2.frame.Item;

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