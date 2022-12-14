package designpattern.factory.methodfactory.ex3_1;

import designpattern.factory.methodfactory.ex3_1.factory.ChicagoPizzaFactory;
import designpattern.factory.methodfactory.ex3_1.factory.NYPizzaFactory;
import designpattern.factory.methodfactory.ex3_1.factory.PizzaFactory;

/**
 *
 * @author skan
 * @since 2022/12/09
 */
public class FactoryMethodMainEx3_1 {

    public static void main(String[] args) {
        System.out.println("----------------------NY--------------------------");
        PizzaFactory pizzaFactory = new NYPizzaFactory();
        pizzaFactory.order("cheese");
        System.out.println("------------------------------------------------");
        pizzaFactory.order("veggie");
        System.out.println("------------------------------------------------");
        pizzaFactory.order("pepperoni");

        System.out.println("------------------------Chicago------------------------");
        pizzaFactory = new ChicagoPizzaFactory();
        pizzaFactory.order("cheese");
        System.out.println("------------------------------------------------");
        pizzaFactory.order("veggie");
        System.out.println("------------------------------------------------");
        pizzaFactory.order("pepperoni");


    }
}
