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
public interface PaymentChain {

    void nextChain(PaymentChain paymentChain);
    void execute(Payment payment);

}
