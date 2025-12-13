package org.example.progreamers;

import java.util.Stack;

public class StackCounter {

    boolean solution(String s) {
        boolean answer = true;
        int balance = 0 ;

        for ( int i = 0 ; i <s.length() ; i++ ) {

            char chr = s.charAt(i);

            // 열린 괄호가 나오면 카운트 증가
            if (chr == '(') {
                balance++;
            } else {
                // 닫긴 괄호가 나오면 카운드 감소
                balance--;
            }

            // 벨런스가 시작부터 맞지 않으면 괄호가 올바르지 않음으로 즉시 false
            if (balance < 0) {
                return false;
            }

        }

        return answer;
    }



    public boolean solution2(String s) {

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if ( c == '(') {
                stack.push(c);
            } else if ( c == ')') {

                // 스택이 비어 있다면, 올바른 괄호가 아님으로 즉시 false 반환
                if (stack.isEmpty()) {
                    return false;
                }

                // 닫는 괄호가 나오면 스텍에서 제거 , 후입선출
                stack.pop();
            }
        }

        System.out.println(stack.isEmpty());
        return stack.isEmpty();

    }

    public static void main(String[] args) {

        StackCounter stackCounter = new StackCounter();
        //boolean result = stackCounter.solution("()()");
        //System.out.println(result);
        //result = stackCounter.solution(")()");
        //System.out.println(result);

        stackCounter.solution2("(())()(())");
        stackCounter.solution2("((()))");
        stackCounter.solution2("(()((");
    }
}
