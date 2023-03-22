package designpattern.creation.factory.methodfactory.ex3_1.factory;

import designpattern.creation.factory.methodfactory.ex3_1.product.Pizza;

 /**
 * @author skan
 * @since 2022/12/09
 */
public abstract class PizzaFactory {


    public Pizza order (String name) {

        Pizza pizza = this.createPizza(name);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    abstract Pizza createPizza(String name) ;
}
