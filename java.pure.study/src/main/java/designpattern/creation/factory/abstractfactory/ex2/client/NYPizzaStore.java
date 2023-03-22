package designpattern.creation.factory.abstractfactory.ex2.client;

import designpattern.creation.factory.abstractfactory.ex2.concrate.CheesePizza;
import designpattern.creation.factory.abstractfactory.ex2.product.Pizza;
import designpattern.creation.factory.abstractfactory.ex2.concrate.PepperoniPizza;
import designpattern.creation.factory.abstractfactory.ex2.concrate.VeggiePizza;
import designpattern.creation.factory.abstractfactory.ex2.factory.NYPizzaIngredientFactory;
import designpattern.creation.factory.abstractfactory.ex2.factory.PizzaIngredientFactory;

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
public class NYPizzaStore extends PizzaStore {

    PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

    @Override
    Pizza createPizza(String name) {

        Pizza pizza = null;
        if (name.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if (name.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
        } else if (name.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
        } else {
            throw new IllegalArgumentException();
        }
        return pizza;
    }
}
