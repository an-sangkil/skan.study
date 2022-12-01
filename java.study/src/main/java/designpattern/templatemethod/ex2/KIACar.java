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
public class KIACar extends Car{
    @Override
    protected void carInspection() {
        System.out.println("기아자동차 소프트웨어 점검");
    }

    @Override
    protected void drive() {
        System.out.println("가아자동차 드라이빙");
    }

    @Override
    protected boolean isSmartCar () {
        // 기본 스마트카로 인식
        return true;
    }
}
