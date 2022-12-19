package designpattern.creation.factory.methodfactory.ex3_2.factory;

import designpattern.creation.factory.methodfactory.ex3_2.Pizza;

/**
 * @author skan
 * @since 2022/12/09
 */
public interface PizzaFactory {

    default void order(String name) {

        if (this.validation(name)) {
            Pizza pizza = this.createPizza(name);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        }

    }

    Pizza createPizza(String name);

    private boolean validation(String pizzaName) {

        if (pizzaName == null || pizzaName.isBlank()) {
            throw new IllegalArgumentException();
        }

        return true;
    }
}
