package designpattern.factory.abstractfactory.ex2.factory;

import designpattern.factory.abstractfactory.ex2.Pizza;
import designpattern.factory.abstractfactory.ex2.concrate.CheesePizza;

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
public class ChicagoPizzaStore extends PizzaStore{

    final PizzaIngredientFactory pizzaIngredientFactory = new ChicagoIngredientFactory();


    @Override
    Pizza createPizza(String name) {

        Pizza pizza = null;
        if (name.equals("cheese")) {
            new CheesePizza(pizzaIngredientFactory);
        } else if (name.equals("veggie")) {

        } else if (name.equals("pepperoni")) {

        } else {
            throw new IllegalArgumentException();
        }


        return null;
    }
}
