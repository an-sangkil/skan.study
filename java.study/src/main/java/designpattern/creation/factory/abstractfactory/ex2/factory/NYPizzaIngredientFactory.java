package designpattern.creation.factory.abstractfactory.ex2.factory;

import designpattern.creation.factory.abstractfactory.ex2.*;
import designpattern.creation.factory.abstractfactory.ex2.Ingredient.MarinaraSauce;
import designpattern.creation.factory.abstractfactory.ex2.Ingredient.MozzarellaCheese;
import designpattern.creation.factory.abstractfactory.ex2.Ingredient.ThinCrustDough;

/**
 * 뉴욕시의 재료공장
 * @author skan
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
