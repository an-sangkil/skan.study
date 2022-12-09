package designpattern.factory.methodfactory.ex3_1;

/**
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/09
 */
public class ChicagoPizzaFactory extends PizzaStore {
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
