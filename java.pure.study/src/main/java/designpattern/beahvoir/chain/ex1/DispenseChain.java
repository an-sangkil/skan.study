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
public interface DispenseChain {

    // 다음 체인핸들러를 등록
    void setNextChain(DispenseChain nextChain);
    // 실제 비지니스 로직
    void dispense(Currency currency);
}
