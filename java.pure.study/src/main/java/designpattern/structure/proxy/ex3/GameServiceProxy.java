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
public class GameServiceProxy implements GameService {

    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() {
        long begin = System.currentTimeMillis();
        gameService.startGame();
        System.out.println("걸린 시간 : " + (System.currentTimeMillis()-begin));
    }
}
