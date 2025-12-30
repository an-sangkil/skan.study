package org.example.progreamers;


import java.util.Stack;

/**
 *  타겟 넘버
 * https://school.programmers.co.kr/learn/courses/30/parts/12421
 */
public class BFSTargetNumber {

    public int solution(int [] number, int target) {
        Stack<int[]> stack  =  new Stack<>();
        stack.push(new int[]{0,0});// index 0, sum 0 부터 시작하도록 설정

        int answer=0;

        while (!stack.isEmpty()) {
            int[] current = stack.pop();  // 스텍에 넣어둔 부분에어 가장 마지막에 넣은것을 꺼내 온다.
            int idx = current[0];
            int sum = current[1];

            // idx 값이 number.length 값만큼 순회 하였으면 종료 한다.
            if (idx == number.length) {
                if (sum == target) {
                    answer++;
                }
                continue;
            }


            stack.push(new int[]{idx+1,sum + number[idx]});
            System.out.printf("index = %s , sum(+) = %s \n", idx , sum +  number[idx]);

            stack.push(new int[]{idx+1,sum - number[idx]});
            System.out.printf("index = %s , sum(-) = %s \n", idx , sum -  number[idx]);

        }

        return answer;
    }



    public static void main(String[] args) {
        BFSTargetNumber test = new BFSTargetNumber();
        System.out.println(test.solution(new int[]{1,2,3,4,5,6,7,8,9}, 5));
    }


}
