package designpattern.beahvoir.chain;

import java.util.Scanner;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @since 2023/01/03
 */
public class ChainResponsibilityMain {

    public static void main(String[] args) {
        DispenseChain chain5 = new Dollar50Dispenser();
        DispenseChain chain2 = new Dollar20Dispenser();
        DispenseChain chain1 = new Dollar10Dispenser();

        chain5.setNextChain(chain2);
        chain2.setNextChain(chain1);

        while (true) {
            int amount = 0;
            System.out.println("변환할 금액을 입력해 주세요.");
            Scanner input = new Scanner(System.in);
            amount = Integer.parseInt(input.next());
            if (amount % 10 != 0) {
                System.out.println("10의 배수를 입력해 주세요 ");
                return;
            }
            chain5.dispense(new Currency(amount));
        }

    }
}
