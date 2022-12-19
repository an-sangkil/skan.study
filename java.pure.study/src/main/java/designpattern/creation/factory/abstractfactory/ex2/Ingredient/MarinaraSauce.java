package designpattern.creation.factory.abstractfactory.ex2.Ingredient;

import designpattern.creation.factory.abstractfactory.ex2.product.Sauce;

/**
 *
 * @author skan
 * @since 2022/12/15
 */
public class MarinaraSauce implements Sauce {
    @Override
    public String name() {
        return "Marinara Sauce";
    }
}
