package designpattern.factory.methodfactory.ex3_1.factory;

import designpattern.factory.methodfactory.ex3_1.NYPepperoniPizza;
import designpattern.factory.methodfactory.ex3_1.NYStyleCheesePizza;
import designpattern.factory.methodfactory.ex3_1.NYVeggiePizza;
import designpattern.factory.methodfactory.ex3_1.Pizza;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/09
 */
public class NYPizzaFactory extends PizzaFactory {
    @Override
    Pizza createPizza(String name) {
        Pizza pizza = null;
        if (name.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (name.equals("veggie")) {
            pizza = new NYVeggiePizza();
        } else if (name.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        } else {
            throw new IllegalArgumentException();
        }
        return pizza;
    }
}
