package designpattern.structure.proxy.ex2;

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
public class GameServerProxy extends GameServer{

     public void startGame () {
         long begin = System.currentTimeMillis();
         super.startGame();
         System.out.println("걸린 시간 : " + (System.currentTimeMillis()-begin));
     }
}
