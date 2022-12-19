package designpattern.creation.factory.simplefactory;

/**
 *
 * @author skan
 * @since 2022/12/09
 */
public class PizzaClient {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.order("cheese");

        System.out.println("-----------------------------------");
        pizzaStore.order("veggie");

        System.out.println("-----------------------------------");
        pizzaStore.order("pepperoni");
    }
}
