package functional;

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
public class FunctionClass04 {
    public static void main(String[] args) {
        processAttack(attack -> attack.attackDown(WeaponType.LONG_SWORD,1));
        processAttack(attack -> attack.attackDown(WeaponType.LONG_SWORD,2));
    }

    public static void processAttack(AttackProcess attackProcess) {
        int damage = attackProcess.process(new Attack());
        System.out.println(damage);
    }

    @FunctionalInterface
    interface AttackProcess {
        int process(Attack attack);
    }

    static class Attack {
        public int attackDown(WeaponType weaponType, int defaultDamage) {
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

