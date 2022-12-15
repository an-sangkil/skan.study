package designpattern.factory.abstractfactory.ex2.concrate;

import designpattern.factory.abstractfactory.ex2.Cheese;
import designpattern.factory.abstractfactory.ex2.Dough;
import designpattern.factory.abstractfactory.ex2.Pizza;
import designpattern.factory.abstractfactory.ex2.Sauce;
import designpattern.factory.abstractfactory.ex2.factory.PizzaIngredientFactory;

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
public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }


    @Override
    public void prepare() {
        Dough dough   = pizzaIngredientFactory.createDough();
        Sauce sauce   = pizzaIngredientFactory.createSauce();
        Cheese cheese = pizzaIngredientFactory.createCheese();

        System.out.println("CheesePizza prepare : "+dough.name());
        System.out.println("CheesePizza prepare : "+sauce.name());
        System.out.println("CheesePizza prepare : "+cheese.name());
    }


}
