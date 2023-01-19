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
public class CreditCardChain implements PaymentChain {

    PaymentChain paymentChain;

    @Override
    public void nextChain(PaymentChain paymentChain) {
        this.paymentChain =  paymentChain;
    }

    @Override
    public void execute(Payment payment) {
        System.out.println("credit card chain");

        if (payment.type.equals("credit")) {
            System.out.println("credit card processing...." + payment);
        } else {

            paymentChain.execute(payment);
        }
    }
}
