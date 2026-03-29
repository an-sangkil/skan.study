package org.example.leetcode;

import java.util.Arrays;

public class RemoveElement {

    /**
     * 투포인터를 활용한 엘리멘트 값 삭제
     *
     * @param nums  제공되는 배열
     * @param val 로 들어오는 인자 값에 대한 삭제
     * @return
     */
    public int  removeElement(int[] nums, int val) {

        int k=0;
        for (int i=0 ; i < nums.length ; i++) {

            if (nums[i] != val) {
                // 배열을 재정의하면서..
                nums[k] = nums[i];
                k++;
            }
        }

        // 이렇게 변환된 k의 크기를 반환한다.
        return k;

    }

    public static void main(String[] args) {

        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3, 2, 2, 3,1,3};
        int val = 3;
        int result = removeElement.removeElement(nums, val);

        // 변경 교체된 Array 를 보여주자.
        System.out.println("Result: " + Arrays.toString(nums));

        // k번만큼만 Array를 복사한다. (변경한 어레이 크기만큼)
        System.out.println("Result: " + Arrays.toString(Arrays.copyOf(nums,result)));

        //결과
        // TARGET: [3, 2, 2, 3]
        // Result: [2, 2, 2, 3]
        // Result: [2, 2]

    }
}
