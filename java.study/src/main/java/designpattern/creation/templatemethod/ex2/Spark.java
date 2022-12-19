package designpattern.creation.templatemethod.ex2;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/11/30
 */
public class Spark extends HyundaiCar {

    @Override
    protected boolean isSmartCar () {
        return false;
    }
}
