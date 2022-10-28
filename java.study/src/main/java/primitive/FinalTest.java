package primitive;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021-06-04
 */
public class FinalTest {

    public static void main(String[] args) {
        User user = new User("http://localhost");
        System.out.println(user.getURL());

        User2 user2 = new User2();
        System.out.println(user2.getURL());

    }

}

// 생성자 초기화 방식의 final 변수,  setter 생성시 오류
class User {

    final String URL;
    User(String url) {
        URL = url;
    }
    public String getURL() {
        return URL;
    }
}

// 블록 초기화 방식의 final 변수, final 변수임으로 setter 생성시 오류
class User2 {

    final String URL;

    {
        URL = "block initialization http://localhost ";
    }

    public String getURL() {
        return URL;
    }

    //public void setURL(String path){
    //    this.URL = path;
    //}
}

