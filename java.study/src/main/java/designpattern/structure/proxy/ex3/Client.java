package designpattern.structure.proxy.ex3;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/23
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("--------------------proxy 없음 ------------------");
        GameService gameService = new DefaultGameService();
        gameService.startGame();

        System.out.println("--------------------proxy 사용 ------------------");

        gameService = new GameServiceProxy(new DefaultGameService());
        gameService.startGame();
    }
}
