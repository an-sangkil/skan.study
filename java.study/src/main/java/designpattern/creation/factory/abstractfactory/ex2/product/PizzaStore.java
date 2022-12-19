package designpattern.creation.factory.abstractfactory.ex2.product;


import designpattern.creation.factory.abstractfactory.ex2.Pizza;

/**
 * 추상화 생성공장
 * @author skan
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
