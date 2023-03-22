package designpattern.creation.factory.methodfactory.ex3_2.factory;


import designpattern.creation.factory.methodfactory.ex3_2.product.ChicagoPepperoniPizza;
import designpattern.creation.factory.methodfactory.ex3_2.product.ChicagoStyleCheesePizza;
import designpattern.creation.factory.methodfactory.ex3_2.product.ChicagoVeggiePizza;
import designpattern.creation.factory.methodfactory.ex3_2.product.Pizza;

/**
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/09
 */
public class ChicagoPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza(String name) {

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
