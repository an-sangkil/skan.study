package skan.study;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021-07-27
 */
public class ProblemSolve_sort_BigNumber {

    public String solution(int[] numbers) {
        String answer = "";

        Integer result[] = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        //List<String> data = Stream.of(result).map(String::valueOf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        String data = Stream.of(result).map(String::valueOf).collect(Collectors.joining(""));
        answer = Arrays.stream(data.split("")).collect(Collectors.toList()).stream().sorted(Comparator.reverseOrder()).collect(Collectors.joining(""));

        System.out.println(answer);

        return answer;
    }

    @Test
    public void bigNumberTest(){
        solution(new int[]{3, 30, 34, 5, 9});
    }
}
