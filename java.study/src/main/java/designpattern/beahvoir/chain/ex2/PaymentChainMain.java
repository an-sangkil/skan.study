package designpattern.beahvoir.chain.ex2;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2023 by CJENM|MezzoMedia. All right reserved.
 * @since 2023/01/19
 */
public class PaymentChainMain {

    public static void main(String[] args) {
        Payment payment = new Payment();
        PaymentChain creditCardChain = new CreditCardChain();
        PaymentChain checkCardChain = new CheckCardChain();
        PaymentChain cashCardChain = new CashCardChain();

        creditCardChain.nextChain(checkCardChain);
        checkCardChain.nextChain(cashCardChain);

        payment.setType("cash");
        creditCardChain.execute(payment);

    }
}
