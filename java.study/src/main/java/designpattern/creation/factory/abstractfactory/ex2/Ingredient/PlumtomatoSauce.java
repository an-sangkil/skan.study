package designpattern.creation.factory.abstractfactory.ex2.Ingredient;

import designpattern.creation.factory.abstractfactory.ex2.product.Sauce;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/15
 */
public class PlumtomatoSauce implements Sauce {
    @Override
    public String name() {
        return "Plumtomato Sauce";
    }
}
