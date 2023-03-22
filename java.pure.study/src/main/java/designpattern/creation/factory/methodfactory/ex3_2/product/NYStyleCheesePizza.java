package designpattern.creation.factory.methodfactory.ex3_2.product;

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
public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "뉴욕 스타일의 치즈피자";
    }

    @Override
    public void bake() {
        System.out.println("뉴욕 치즈 피자흫 화덕에 넣고 굽숩니다.");
    }

    @Override
    public void cut(){
        System.out.println("뉴욕 치즈 피자를 컷팅 합니다.");
    }

    @Override
    public void box()  {
        System.out.println("뉴욕 치즈 피자를 박싱합니다.");
    }
}
