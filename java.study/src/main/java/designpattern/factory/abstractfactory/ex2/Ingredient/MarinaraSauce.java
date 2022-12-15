package designpattern.factory.abstractfactory.ex2.Ingredient;

import designpattern.factory.abstractfactory.ex2.Sauce;

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
