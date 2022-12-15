package designpattern.factory.abstractfactory.ex2.factory;

import designpattern.factory.abstractfactory.ex2.*;
import designpattern.factory.abstractfactory.ex2.Ingredient.MarinaraSauce;
import designpattern.factory.abstractfactory.ex2.Ingredient.MozzarellaCheese;
import designpattern.factory.abstractfactory.ex2.Ingredient.ThickCrustDough;
import designpattern.factory.abstractfactory.ex2.Ingredient.ThinCrustDough;

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
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }
}
