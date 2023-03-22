package designpattern.creation.factory.methodfactory.ex3_2;

import designpattern.creation.factory.methodfactory.ex3_2.factory.ChicagoPizzaFactory;
import designpattern.creation.factory.methodfactory.ex3_2.factory.NYPizzaFactory;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/09
 */
public class FactoryMethodMainEx3_2 {

    public static void main(String[] args) {
        new NYPizzaFactory().order("cheese");
        new ChicagoPizzaFactory().order("cheese");
    }
}
