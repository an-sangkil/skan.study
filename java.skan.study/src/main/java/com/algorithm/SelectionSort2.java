package com.algorithm;

public class SelectionSort2 {
	public static void main(String[] args) {
		int[] index = { 5,4,2,1,3,7,8,6};
		int min , temp;
		
		for (int i = 0; i < index.length; i++) {
			min = i ;
			for (int j = i+1; j < index.length; j++) {
				if(index[min] > index[j]) {
					min = j;
					
				}
			}
			temp = index[min];
			index[min] = index[i];
			index[i] = temp;
		}
		
		for (int  i = 0 ; i < index.length; i++) {
			System.out.println(index[i]);
		}
	}
}
