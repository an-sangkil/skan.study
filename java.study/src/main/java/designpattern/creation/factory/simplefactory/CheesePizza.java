package designpattern.creation.factory.simplefactory;

/**
 *
 *  *  @author skan
 * @since 2022/12/09
 */
public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("치즈 피자 재료를 준비합니다.");
    }

    @Override
    public void bake() {
        System.out.println("치즈 피자흫 화덕에 넣고 굽숩니다.");
    }

    @Override
    public void cut()
    {
        System.out.println("치즈 피자를 컷팅 합니다.");
    }

    @Override
    public void box()  {
        System.out.println("치즈 피자를 박싱합니다.");
    }
}
