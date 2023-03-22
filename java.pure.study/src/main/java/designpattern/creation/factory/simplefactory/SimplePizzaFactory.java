package designpattern.creation.factory.simplefactory;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/09
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String name) {
        Pizza pizza = null;

        if (name.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (name.equals("veggie")) {
            pizza = new VeggiePizza();
        } else if (name.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else {
            throw new IllegalArgumentException();
        }
        return pizza;
    }
}
