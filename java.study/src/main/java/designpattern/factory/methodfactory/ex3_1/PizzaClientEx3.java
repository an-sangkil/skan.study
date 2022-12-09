package designpattern.factory.methodfactory.ex3_1;

/**
 *
 * @author skan
 * @since 2022/12/09
 */
public class PizzaClientEx3 {

    public static void main(String[] args) {
        System.out.println("----------------------NY--------------------------");
        PizzaStore pizzaStore = new NYPizzaFactory();
        pizzaStore.order("cheese");
        pizzaStore.order("veggie");
        pizzaStore.order("pepperoni");

        System.out.println("------------------------Chicago------------------------");
        pizzaStore = new ChicagoPizzaFactory();
        pizzaStore.order("cheese");
        pizzaStore.order("veggie");
        pizzaStore.order("pepperoni");


    }
}
