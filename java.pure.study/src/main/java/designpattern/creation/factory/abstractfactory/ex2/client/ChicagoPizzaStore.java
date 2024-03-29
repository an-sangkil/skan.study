package designpattern.creation.factory.abstractfactory.ex2.client;

import designpattern.creation.factory.abstractfactory.ex2.product.Pizza;
import designpattern.creation.factory.abstractfactory.ex2.concrate.CheesePizza;
import designpattern.creation.factory.abstractfactory.ex2.concrate.PepperoniPizza;
import designpattern.creation.factory.abstractfactory.ex2.concrate.VeggiePizza;
import designpattern.creation.factory.abstractfactory.ex2.factory.ChicagoIngredientFactory;
import designpattern.creation.factory.abstractfactory.ex2.factory.PizzaIngredientFactory;

/**
 *
 *  *  @author skan
 * @since 2022/12/14
 */
public class ChicagoPizzaStore extends PizzaStore {


    // 피자 생성시 어떤 재료공장의 팩토리를 사용할지 선택한다.
    final PizzaIngredientFactory pizzaIngredientFactory = new ChicagoIngredientFactory();


    @Override
    Pizza createPizza(String name) {

        Pizza pizza = null;
        if (name.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if (name.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
        } else if (name.equals("pepperoni")) {
            pizza =  new PepperoniPizza(pizzaIngredientFactory);
        } else {
            throw new IllegalArgumentException();
        }

        return pizza;
    }
}
