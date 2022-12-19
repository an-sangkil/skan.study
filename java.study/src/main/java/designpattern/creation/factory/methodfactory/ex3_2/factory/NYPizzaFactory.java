package designpattern.creation.factory.methodfactory.ex3_2.factory;


import designpattern.creation.factory.methodfactory.ex3_2.NYPepperoniPizza;
import designpattern.creation.factory.methodfactory.ex3_2.NYStyleCheesePizza;
import designpattern.creation.factory.methodfactory.ex3_2.NYVeggiePizza;
import designpattern.creation.factory.methodfactory.ex3_2.Pizza;

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
public class NYPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza(String name) {
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
