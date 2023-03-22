package designpattern.structure.flyweight.ex2;

import java.util.stream.IntStream;

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
public class FlyweightClientMain2 {

    public static void main(String[] args) {

        final CarFactory carFactory = new CarFactory();

        IntStream.rangeClosed(0,5).forEach(value -> {
            Car car = carFactory.createCar("benz","V6");
            car.build();

        });

        IntStream.rangeClosed(0,5).forEach(value -> {
            Car car = carFactory.createCar("hyundai","V6");
            car.build();

        });

        IntStream.rangeClosed(0,5).forEach(value -> {
            Car car = carFactory.createCar("bmw","V6");
            car.build();

        });

    }
}
