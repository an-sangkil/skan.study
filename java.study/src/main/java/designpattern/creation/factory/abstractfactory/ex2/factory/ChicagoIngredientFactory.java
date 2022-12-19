package designpattern.creation.factory.abstractfactory.ex2.factory;

import designpattern.creation.factory.abstractfactory.ex2.*;
import designpattern.creation.factory.abstractfactory.ex2.Ingredient.*;

/**
 *
 * 시카고 재료공장
 * @author skan
 * @since 2022/12/14
 */
public class ChicagoIngredientFactory implements  PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Sauce createSauce() {
        return new PlumtomatoSauce();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }
}
