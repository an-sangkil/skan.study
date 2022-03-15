package generic;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by skan. All right reserved.
 * @since 2021/10/08
 */
public class GenericTest {

    public static void main(String[] args) {
        User<String> user = new User<>();
        user.getUserName("sangkil");

        user.getUserAge(13);
    }
}

class User<T> {

    T t;

    public void getUserName (T t) {
        System.out.println("userName = " + t);
        System.out.println("userName = " + this.t);

    }

    public <T> void getUserAge(T t) {
        System.out.println("user age = " + t);
    }

}

