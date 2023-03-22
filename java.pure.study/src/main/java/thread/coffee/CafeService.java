package thread.coffee;

/**
 *
 * @author skan
 * @since 2022/11/17
 */
public class CafeService {
    public CoffeeEntity getCoffee(String name, long price) throws InterruptedException {
        return this.makeCoffee(name,price);
    }

    private CoffeeEntity makeCoffee(String name, long price) throws InterruptedException{
        // 커피 만들때 항상 2초가 걸린다.
        Thread.sleep(2000);
        return new CoffeeEntity(name,price);
    }
}
