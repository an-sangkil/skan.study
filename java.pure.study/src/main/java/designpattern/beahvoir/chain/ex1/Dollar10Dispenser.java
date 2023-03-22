package designpattern.beahvoir.chain.ex1;

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
public class Dollar10Dispenser implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {

        if (currency.getAmount() >= 10) {
            int num = currency.getAmount()/10;
            int remainder = currency.getAmount() % 10;
            System.out.println("분배 : " + num + " * 10$ ");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }

    }
}
