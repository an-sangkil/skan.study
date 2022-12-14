package designpattern.factory.methodfactory.ex3_1;

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
public abstract class Pizza {

    String name;
    String dough;
    String sauce;

    public void prepare() {
        System.out.println("준비 : "+  name);
        System.out.println("Tossing dough...");
        System.out.println("adding sauce...");
        System.out.println("adding toppings ...");

    }
    public void bake() {
        System.out.println("피자를 화덕에 넣고 굽숩니다.");
    }

    public void cut() {
        System.out.println("피자를 컷팅 합니다.");
    }

    public void box()  {
        System.out.println("피자를 박싱합니다.");
    }

    public String getName() {
        return name;
    }

}
