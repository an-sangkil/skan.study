package org.example.plain;

/**
 * 구구단 테스트
 */
public class MultiplicationTable {


    /**
     *
     * @param n 구구단에서 뒤에 곱할 수
     * @param target 구구단에서 앞에 나오는 수 (기준)
     */
    public void gugudan(int n, int target) {
        if (n == 0 ){
            return;
        }

        this.gugudan((n-1),target);
        System.out.println(target + "*" + n +"=" + target*n);


    }

    public static void main(String[] args) {

        MultiplicationTable MultiplicationTable = new MultiplicationTable();
        MultiplicationTable.gugudan(9,7);
    }
}
