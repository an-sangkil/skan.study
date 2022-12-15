package designpattern.factory.abstractfactory.ex2.concrate;

import designpattern.factory.abstractfactory.ex2.Cheese;
import designpattern.factory.abstractfactory.ex2.Dough;
import designpattern.factory.abstractfactory.ex2.Pizza;
import designpattern.factory.abstractfactory.ex2.Sauce;
import designpattern.factory.abstractfactory.ex2.factory.PizzaIngredientFactory;

/**
 *
 * @author skan
 * @since 2022/12/14
 */
public class PepperoniPizza extends Pizza {

    final private PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {

        Dough dough   = pizzaIngredientFactory.createDough();
        Sauce sauce   = pizzaIngredientFactory.createSauce();
        Cheese cheese = pizzaIngredientFactory.createCheese();

        System.out.println("PepperoniPizza prepare : "+dough.name());
        System.out.println("PepperoniPizza prepare : "+sauce.name());
        System.out.println("PepperoniPizza prepare : "+cheese.name());

    }
}
