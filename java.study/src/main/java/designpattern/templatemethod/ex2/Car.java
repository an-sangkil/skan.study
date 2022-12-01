package designpattern.templatemethod.ex2;

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
public abstract class Car {

    public void run() {
        this.start();

        if (this.isSmartCar() ) {
            carInspection();
        }
        this.drive();
    }

    final protected void start(){
        System.out.println("시동을 겁니다.");
    }

    // 제조사별 점검
    abstract protected void carInspection();

    // 제조사 자동차별로 운전하는 방식이 다르므로 서브클레스에서 구현
    abstract protected void drive() ;

    // 스트카인지 확인하기위한 hooking method
    protected boolean isSmartCar () {
        return true;
    }
}
