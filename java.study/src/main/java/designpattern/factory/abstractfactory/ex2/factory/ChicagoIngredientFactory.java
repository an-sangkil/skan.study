package designpattern.factory.abstractfactory.ex2.factory;

import designpattern.factory.abstractfactory.ex2.*;
import designpattern.factory.abstractfactory.ex2.Ingredient.ReggianoCheese;
import designpattern.factory.abstractfactory.ex2.Ingredient.SlicedPepperoni;
import designpattern.factory.abstractfactory.ex2.Ingredient.ThinCrustDough;

/**
 * 시카고 재료공장
 * @author skan
 * @since 2022/12/14
 */
public class ChicagoIngredientFactory implements  PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Sauce createSauce() {
        return null;
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
