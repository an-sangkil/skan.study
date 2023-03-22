package designpattern.structure.proxy.ex1;

/**
 * 아무것도 적용되지 않은 일반적인 구현
 *
 * @author skan
 * @since 2022/12/23
 */
public class Client {

    public static void main(String[] args) {
        GameServer gameServer = new GameServer();
        gameServer.startGame();
    }

}
