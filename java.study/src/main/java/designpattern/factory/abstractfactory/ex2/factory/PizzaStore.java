package designpattern.factory.abstractfactory.ex2;


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
public abstract class PizzaStore {
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
