package designpattern.creation.factory.abstractfactory.ex2.Ingredient;

import designpattern.creation.factory.abstractfactory.ex2.Cheese;

/**
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/14
 */
public class ReggianoCheese implements Cheese {
    @Override
    public String name() {
        return "Reggiano Cheese";
    }
}
