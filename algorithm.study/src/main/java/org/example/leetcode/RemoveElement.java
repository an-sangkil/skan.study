package org.example.leetcode;

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
        for (int i=0; i< nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
            }
            k++;
        }

        System.out.println("k");

        return k;


    }

    public static void main(String[] args) {

    }
}
