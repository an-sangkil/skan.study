package designpattern.factory.abstractfactory.ex2.Ingredient;

import designpattern.factory.abstractfactory.ex2.Cheese;

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
public class MozzarellaCheese implements Cheese {
    @Override
    public String name() {
       return"Mozzarella Cheese";
    }
}
