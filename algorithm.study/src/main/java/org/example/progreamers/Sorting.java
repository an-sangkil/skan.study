package org.example.progreamers;

import java.util.Arrays;

public class Sorting {

    public int[] bubbleSort(int[] arr) {

        int n = arr.length;


        for ( int i = 0 ; i < n-1; i++ ) {

            boolean swapped = false;
            for (int j = 0 ; j< n-1-i ; j++) {
                if (arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped =true;

                }
            }

            if (!swapped){
                System.out.println("이미 정렬된 상태 입니다.");
                break;
            }

        }

        return arr;
    }

    public static void main(String[] args) {

        Sorting sorting = new Sorting();
        int[] result = sorting.bubbleSort(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(result));

    }
}
