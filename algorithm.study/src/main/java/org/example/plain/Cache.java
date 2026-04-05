package org.example.plain;

import java.util.LinkedList;
import java.util.List;

/**
 * 프로그래머스 Lv2 - [1차]캐시 (LRU 알고리즘)
 * 출처: https://hstory0208.tistory.com/entry/Java자바-프로그래머스-Lv2-1차캐시-LRU-알고리즘 [< Hyun / Log >:티스토리]
 *
 * 캐시 교체 알고리즘은 LRU(Least Recently Used)를 사용한다.
 * cache hit일 경우 실행시간은 1이다.
 * cache miss일 경우 실행시간은 5이다.
 *
 */
public class Cache {

    public static void main(String[] args) {
        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));

    }

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        // 캐시크기가 0일 경우
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        List<String> cacheLRU = new LinkedList<>();
        for (int i= 0; i < cities.length; i++) {

            String city = cities[i].toLowerCase();

            if (!cacheLRU.contains(city)){
                answer += 5;
                if (cacheLRU.size() >= cacheSize) {
                    cacheLRU.removeFirst();
                }
                cacheLRU.add(city);
                continue;
            }

            if (cacheLRU.contains(city)){
                answer +=1;
                cacheLRU.remove(city);
                cacheLRU.add(city);
            }
        }


        return answer;
    }



}
