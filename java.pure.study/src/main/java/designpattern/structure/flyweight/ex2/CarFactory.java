package designpattern.structure.flyweight.ex2;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2023 by CJENM|MezzoMedia. All right reserved.
 * @since 2023/01/27
 */
public class CarFactory {
    private final Map<String, Car> carPool = new HashMap<>();

    public Car createCar(String carName, String cylinder) {

        Car car = carPool.get(carName);
        if (car == null) {

            var newCar = switch (carName) {
                case "benz" -> new Benz();
                case "bmw" -> new BMW();
                case "hyundai" -> new Hyundai();
                default -> throw new IllegalArgumentException("type 이 존재 하지 않습니다.");
            };

            carPool.put(carName, newCar);
            car = newCar;
            System.out.println("새로운 인스턴스를 생성합니다 new  :" + carName);

        }


        return car;

    }


}
