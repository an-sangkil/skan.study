package designpattern.creation.factory.abstractfactory.ex2;

import designpattern.creation.factory.abstractfactory.ex2.client.ChicagoPizzaStore;
import designpattern.creation.factory.abstractfactory.ex2.client.NYPizzaStore;
import designpattern.creation.factory.abstractfactory.ex2.client.PizzaStore;

/**
 *
 *  @author skan
 * @since 2022/12/14
 */
public class AbstractFactoryMainEx2 {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.order("cheese");
        pizzaStore.order("veggie");
        pizzaStore.order("pepperoni");

        System.out.println("-----------------------------------------------");
        pizzaStore = new ChicagoPizzaStore();
        pizzaStore.order("cheese");
        pizzaStore.order("veggie");
        pizzaStore.order("pepperoni");
    }
}
