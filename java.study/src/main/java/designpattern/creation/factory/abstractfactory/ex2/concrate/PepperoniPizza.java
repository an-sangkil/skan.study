package designpattern.creation.factory.abstractfactory.ex2.concrate;

import designpattern.creation.factory.abstractfactory.ex2.product.Cheese;
import designpattern.creation.factory.abstractfactory.ex2.product.Dough;
import designpattern.creation.factory.abstractfactory.ex2.product.Pizza;
import designpattern.creation.factory.abstractfactory.ex2.product.Sauce;
import designpattern.creation.factory.abstractfactory.ex2.factory.PizzaIngredientFactory;

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
