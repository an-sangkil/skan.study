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
public class NYPepperoniPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("뉴욕  페페로니 피자 재료를 준비합니다.");
    }

    @Override
    public void bake() {
        System.out.println("뉴욕  페페로니 피자흫 화덕에 넣고 굽숩니다.");
    }

    @Override
    public void cut()
    {
        System.out.println("뉴욕  페페로니 피자를 컷팅 합니다.");
    }

    @Override
    public void box()  {
        System.out.println("뉴욕  페페로니 피자를 박싱합니다.");
    }
}
