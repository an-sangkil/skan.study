package designpattern.factory.methodfactory.ex3_2;

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
public class PizzaClientEx3_2 {

    public static void main(String[] args) {
        new NYPizzaFactory().order("cheese");
    }
}
