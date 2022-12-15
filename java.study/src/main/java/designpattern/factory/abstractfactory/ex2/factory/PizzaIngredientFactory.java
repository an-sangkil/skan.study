package designpattern.factory.abstractfactory.ex2.factory;

import designpattern.factory.abstractfactory.ex2.*;

/**
 *
 *  *  @author skan
 * @since 2022/12/14
 */
public interface PizzaIngredientFactory {
    // 도흐
    Dough createDough();

    // 치즈
    Cheese createCheese();

    // 소스
    Sauce createSauce();

    // 페페로니
    Pepperoni createPepperoni();

    // 채소
    Veggies[] createVeggies();
}
