package functional;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/06/21
 */
public class FunctionClass03 {

    static FunctionClass03 functionExample = new FunctionClass03();
    public static void main(String[] args) throws Exception {
        FutureTask<String> futureTask = new FutureTask<>(functionExample.fetch());
        futureTask.run();
        String str = futureTask.get();
        System.out.println(str);

    }


    public Callable<String> fetch () {
        return () -> "callable fetch ;-) ";
    }
    static class Attack {
        public int attackDown(FunctionClass04.WeaponType weaponType, int defaultDamage) {
            return switch (weaponType) {
                case LONG_SWORD -> 5 * defaultDamage;
                case SHORT_SWORD -> 3 * defaultDamage;
            };

        }
    }

    enum WeaponType {
        LONG_SWORD,
        SHORT_SWORD,

    }
}
