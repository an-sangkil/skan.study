package designpattern.factory.abstractfactory.ex2.Ingredient;

import designpattern.factory.abstractfactory.ex2.Dough;

/**
 *
 * @author skan
 * @since 2022/12/14
 */
public class ThinCrustDough implements Dough {
    @Override
    public String name() {
        return "thin crust dough";
    }
}
