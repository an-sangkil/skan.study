package designpattern.beahvoir.chain.ex1;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2023 by CJENM|MezzoMedia. All right reserved.
 * @since 2023/01/03
 */
public class Dollar50Dispenser implements DispenseChain{

    private  DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {

        if (currency.getAmount() >= 50) {
            int num = currency.getAmount()/50;
            int remainder = currency.getAmount() % 50;
            System.out.println("분배 : " + num + " * 50$ ");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }

    }
}
