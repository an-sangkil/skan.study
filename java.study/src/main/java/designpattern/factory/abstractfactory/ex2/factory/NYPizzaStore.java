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
public class NYPizzaStore extends PizzaStore{

    PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
    @Override
    Pizza createPizza(String name) {


        new CheesePizza(pizzaIngredientFactory);

        return null;
    }


}
