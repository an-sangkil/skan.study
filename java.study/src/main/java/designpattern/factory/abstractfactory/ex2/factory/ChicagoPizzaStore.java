package designpattern.factory.abstractfactory.ex2.factory;

import designpattern.factory.abstractfactory.ex2.Pizza;
import designpattern.factory.abstractfactory.ex2.concrate.CheesePizza;
import designpattern.factory.abstractfactory.ex2.concrate.PepperoniPizza;
import designpattern.factory.abstractfactory.ex2.concrate.VeggiePizza;

/**
 *
 *  *  @author skan
 * @since 2022/12/14
 */
public class ChicagoPizzaStore extends PizzaStore{

    final PizzaIngredientFactory pizzaIngredientFactory = new ChicagoIngredientFactory();


    @Override
    Pizza createPizza(String name) {

        Pizza pizza = null;
        if (name.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if (name.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
        } else if (name.equals("pepperoni")) {
            pizza =  new PepperoniPizza(pizzaIngredientFactory);
        } else {
            throw new IllegalArgumentException();
        }

        return pizza;
    }
}
