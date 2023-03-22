package designpattern.creation.factory.methodfactory.ex3_1.product;

/**
 *
 * @author skan
 * @since 2022/12/09
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "시카고 스타일의 치즈피자";
    }

    @Override
    public void bake() {
        System.out.println("시카고 치즈 피자흫 화덕에 넣고 굽숩니다.");
    }

    @Override
    public void cut()
    {
        System.out.println("시카고의 치즈 피자를 컷팅 합니다.");
    }

    @Override
    public void box()  {
        System.out.println("시카고의 치즈 피자를 박싱합니다.");
    }
}
