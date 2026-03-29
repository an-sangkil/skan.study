package org.example.plain;

import java.util.*;

/**
 * 🧪 라이브 코딩 문제 (타이머 20~30분)
 * 문제: 주문 로그 집계 + Top K
 *
 * 다음과 같은 주문 로그가 주어진다:
 *
 * [
 *  "user1,1000",
 *  "user2,2000",
 *  "user1,500",
 *  "user3,700",
 *  "user2,300"
 * ]
 * 요구사항
 * 사용자별 총 구매 금액을 계산하라
 * 구매 금액 기준으로 상위 K명의 사용자 ID를 반환하라
 * 함수 시그니처 (Java)
 * public static List<String> solution(List<String> logs, int k)
 * 반환값
 * 구매 금액 내림차순 기준 상위 K명 userId 리스트
 * 금액이 같으면 userId 오름차순
 * 예시
 * 입력:
 * logs = ["user1,1000", "user2,2000", "user1,500", "user3,700", "user2,300"]
 * k = 2
 *
 * 출력:
 * ["user2", "user1"]
 * 조건
 * 1 ≤ logs.length ≤ 100,000
 * 금액은 양의 정수
 * userId는 문자열
 * 💡 힌트 (원하면만 봐)
 * HashMap
 * 정렬 or PriorityQueue
 *
 */
public class 총금액계산 {

    // 입력:
    //logs = ["user1,1000", "user2,2000", "user1,500", "user3,700", "user2,300"]
    //k = 2
    //
    //출력:
    //["user2", "user1"]

    public static void solution(List<String> logs, int k) {


        Map<String, Integer> lankingMap = new HashMap<>();


        logs.forEach(log->{

                    String[] logAr = log.split(",");
                    String userName = logAr[0];
                    Integer selling  =  Integer.parseInt(logAr[1]);

                    if (lankingMap.containsKey(userName)) {
                        Integer oldValue = lankingMap.get(userName);
                        lankingMap.put(userName, oldValue+selling);
                    } else {
                        lankingMap.put(userName,  selling);
                    }
                }
        );

        List<Integer> valueList = new ArrayList<>(lankingMap.values());
        valueList.sort((o1, o2) -> o2.compareTo(o1));


        List<Map.Entry<String,Integer>> list = new ArrayList<>(lankingMap.entrySet());

        list.sort((a, b) -> {

            if (!b.getValue().equals(a.getValue())){

                return b.getValue() - a.getValue();
            }

            return a.getKey().compareTo(b.getKey());

        });


        list.forEach(stringIntegerEntry -> {

            System.out.println("key = "+ stringIntegerEntry.getKey() +"  value ="+ stringIntegerEntry.getValue() );


        });







    }

    public static void main(String[] args) {
        List<String> logs = Arrays.asList("user1,1000", "user2,2000", "user1,500", "user3,700", "user2,300");
        int k = 2;
        solution(logs, k);
    }

}
