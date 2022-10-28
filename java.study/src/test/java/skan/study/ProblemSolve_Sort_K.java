package skan.study;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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
public class ProblemSolve_Sort_K {

    public static void main(String[] args) {
        ProblemSolve_Sort_K problemSolve_sort_k = new ProblemSolve_Sort_K();
        problemSolve_sort_k.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int index = 0;

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int targetNumber = commands[i][2];

            Integer[] result = this.slice(array, start, end);
            Arrays.sort(result);
            answer[index] = result[targetNumber - 1];
            index++;
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public Integer[] slice(int[] array, int start, int end) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i >= start - 1 && i <= end - 1) {
                integerList.add(array[i]);
            }
        }


        return integerList.toArray(new Integer[integerList.size()]);

    }

    @Test
    void slice_test() {
        //this.slice(new int[]{1, 5, 2, 6, 3, 7, 4},new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}},new int[]{5,6,3});
        Integer[] result = this.slice(new int[]{1, 5, 2, 6, 3, 7, 4}, 2, 4);
        for (Integer integer : result) {
            System.out.printf("%d, ", integer);
        }

    }
}
