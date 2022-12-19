package designpattern.creation.factory.abstractfactory.ex2.Ingredient;

import designpattern.creation.factory.abstractfactory.ex2.Dough;

/**
 *
 *  *  @author skan
 * @since 2022/12/14
 */
public class ThickCrustDough implements Dough {
    @Override
    public String name() {
        return "thick crust dough";
    }
}
