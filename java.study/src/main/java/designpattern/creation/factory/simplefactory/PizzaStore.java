package designpattern.creation.factory.simplefactory;

/**
 *
 * 클라이언트~~
 * @author skan
 * @since 2022/12/09
 */
public class PizzaStore  {

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore (SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza order (String name) {

        Pizza pizza = simplePizzaFactory.createPizza(name);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
