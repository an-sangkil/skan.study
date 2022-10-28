package functional;

import java.util.List;
import java.util.function.Supplier;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/06/13
 */
public class FunctionClass02 {

    public static void main(String[] args) {

        AttackService attackService = new AttackService();
        attackService.attackUser("user1", ShortSword::new, 3);
        attackService.attackUser("user2", LongSword::new, 5);
    }

    static class AttackService {
        public void attackUser (String targetUser, Supplier<Weapon> weapon, int damage) {
            System.out.print(targetUser +" : ");
            weapon.get().attack(damage);
        }
    }

    @FunctionalInterface
    interface Weapon {
        void attack(int damages);
    }

    static class LongSword implements Weapon{
        @Override
        public void attack(int damages) {
            System.out.printf("long sword attack = %s \n", damages);
        }
    }

    static class ShortSword implements Weapon {
        @Override
        public void attack(int damages) {

            System.out.printf("short sword attack = %s \n", damages);

        }
    }

}

