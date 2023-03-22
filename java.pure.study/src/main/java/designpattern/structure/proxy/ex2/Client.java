package designpattern.structure.proxy.ex2;

/**
 * 프록시를 둠으로 오퍼레이션을 호출하였을때 시간이 얼마나 걸렸는지 확인한다.
 *  - 기존코드를 수정하지 않고 사용
 *
 *
 * @author skan
 * @since 2022/12/23
 */
public class Client {

    public static void main(String[] args) {
        GameServer gameServer = new GameServerProxy();
        gameServer.startGame();
    }

}
