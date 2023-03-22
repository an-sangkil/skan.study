package designpattern.creation.factory.abstractfactory.ex2.concrate;

import designpattern.creation.factory.abstractfactory.ex2.product.Cheese;
import designpattern.creation.factory.abstractfactory.ex2.product.Dough;
import designpattern.creation.factory.abstractfactory.ex2.product.Pizza;
import designpattern.creation.factory.abstractfactory.ex2.product.Sauce;
import designpattern.creation.factory.abstractfactory.ex2.factory.PizzaIngredientFactory;

/**
 *
 * @author skan
 * @since 2022/12/15
 */
public class VeggiePizza extends Pizza {

    PizzaIngredientFactory factory;

    public VeggiePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        Dough dough   = factory.createDough();
        Sauce sauce   = factory.createSauce();
        Cheese cheese = factory.createCheese();

        System.out.println("PepperoniPizza prepare : "+dough.name());
        System.out.println("PepperoniPizza prepare : "+sauce.name());
        System.out.println("PepperoniPizza prepare : "+cheese.name());
    }
}
