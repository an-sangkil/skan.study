package designpattern.factory.abstractfactory.ex2;

import designpattern.factory.abstractfactory.ex2.factory.NYPizzaStore;
import designpattern.factory.abstractfactory.ex2.factory.PizzaStore;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/14
 */
public class AbstractFactoryMainEx2 {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.order("cheese");
    }
}
