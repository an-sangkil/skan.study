package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {


        for (int i = 0 ; i < nums.length ; i++) {
            for (int j = 1 ; j < nums.length ; j++) {

                int result = nums[i] + nums[j];

                System.out.println (nums[i] + "+" + nums[j] + "="+ result);
                if (result == target) {
                    return new int[]{i ,j};
                }
            }
        }

        return null;
    }

    public int[] twoSum2(int[] nums, int target) {


        Map<Integer, Integer> map = new HashMap<>();

        // 값을 순회 하며 합하여 확인
        for ( int i = 0; i < nums.length; i++) {

            int current = nums[i];
            int complement = target - current;

            // map에 이미등록된 보수가 있는지 확인한다.
            // 보수란 ?   어떤 수에 더해 특정 기준이 되는 수 
            //  1) 10이 되기 위한 3의 보수는 7  ( 3+7 = 10)
            //  2) 5이 되기 위한  10의 보수는 2 ( 5 = 10/2)
            // 덧셈 뺄셈 나눗셈... 등 특정기준이 되게 해주는 수를 뜻함.
            if ( map.containsKey(complement)) {
                return new int[]{ map.get(complement),i};
            }

            // 보수가 없는경우 현재 값을 등록한다.
            map.put(current, i);

        }

        return  null;
    }


    public static void main(String[] args) throws Exception {

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2, 11, 15, 7, 5}, 18);
        System.out.println(Arrays.toString(result));
        System.out.println("-----------------------------");
        result = twoSum.twoSum2(new int[]{2, 11, 15, 7, 5}, 18);
        System.out.println(Arrays.toString(result));
    }
}
