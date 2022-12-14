package designpattern.factory.abstractfactory.ex2;

/**
 *
 *  *  @author skan
 * @since 2022/12/14
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Cheese createCheese();
    Sauce createSauce();
    Pepperoni createPepperoni();


}
