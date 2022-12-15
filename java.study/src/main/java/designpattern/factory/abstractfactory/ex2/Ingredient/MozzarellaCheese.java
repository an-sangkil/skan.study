package designpattern.factory.abstractfactory.ex2.Ingredient;

import designpattern.factory.abstractfactory.ex2.Cheese;

/**
 *
 * @author skan
 * @since 2022/12/14
 */
public class MozzarellaCheese implements Cheese {
    @Override
    public String name() {
       return"Mozzarella Cheese";
    }
}
