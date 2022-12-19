package designpattern.creation.factory.abstractfactory.ex2.Ingredient;

import designpattern.creation.factory.abstractfactory.ex2.Pepperoni;

/**
 *
 * @author skan
 * @since 2022/12/14
 */
public class SlicedPepperoni implements Pepperoni {
    @Override
    public String name() {
       return "sliced pepperoni";
    }
}
