package designpattern.creation.factory.methodfactory.ex3_1.factory;

import designpattern.creation.factory.methodfactory.ex3_1.product.ChicagoPepperoniPizza;
import designpattern.creation.factory.methodfactory.ex3_1.product.ChicagoStyleCheesePizza;
import designpattern.creation.factory.methodfactory.ex3_1.product.ChicagoVeggiePizza;
import designpattern.creation.factory.methodfactory.ex3_1.product.Pizza;

/**
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/09
 */
public class ChicagoPizzaFactory extends PizzaFactory {
    @Override
    Pizza createPizza(String name) {
        Pizza pizza = null;
        if (name.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (name.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        } else if (name.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        } else {
            throw new IllegalArgumentException();
        }

        return pizza;
    }
}
