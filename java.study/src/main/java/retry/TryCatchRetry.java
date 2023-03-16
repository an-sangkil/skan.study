package retry;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @since 2022/11/15
 */
public class TryCatchRetry {

    static int globalCount = 0;
    public static void main(String[] args) {
        TryCatchRetry tryCatchRetry = new TryCatchRetry();
        tryCatchRetry.method_1(null);

    }

    void method_1(String code) {
        TryCatchRetry tryCatchRetry = new TryCatchRetry();
        boolean isRetry = false;
        try {
            isRetry = tryCatchRetry.method_2(code).equals("err");
            if (isRetry){
                tryCatchRetry.retry();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (!isRetry) {
                System.out.println("finally");
            }
        }
    }
    String method_2(String code) {
        if (code ==  null) {
            return "err";
        } else if (code.equals("success")) {
            return "success";
        } else {
            return code;
        }
    }

    void retry () {
        if (globalCount < 3 ) {
            globalCount = globalCount+1;

            System.out.println(globalCount);
            TryCatchRetry tryCatchRetry = new TryCatchRetry();


            if (globalCount == 3) {
                tryCatchRetry.method_1("success");
            } else {
                tryCatchRetry.method_1(null);
            }


        } else {
            System.out.println("exit");
        }
    }
}
