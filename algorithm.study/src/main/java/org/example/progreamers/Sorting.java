package org.example.progreamers;

import java.util.Arrays;

public class Sorting {

    public int[] bubbleSort(int[] arr) {

        int n = arr.length;

        for ( int i = 0 ;  i < n -1 ; i++) {
            
            boolean swapped = false;

            for ( int j = 0 ; j < n -1 -i; j++){
                
                if(arr[j]> arr[j+1]) {
                    int temp = arr[j];

                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

            }


        }


        return arr;
    }

    public static void main(String[] args) {

        Sorting sorting = new Sorting();
        int[] result = sorting.bubbleSort(new int[]{3,2,1,4,5});
        System.out.println(Arrays.toString(result));

    }
}
