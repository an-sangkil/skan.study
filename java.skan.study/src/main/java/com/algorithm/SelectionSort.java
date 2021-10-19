package com.algorithm;

public class SelectionSort {
	public static void main(String[] args) {
		
		// 선택 정렬 알고리즘
		// 정렬되지 않은 값들중 가장 처음 자리부터 이를 포함한 마지막 자리까지 가장 작은값을 찾아간다.
		// 가장작은 값을 찾으면, 해당 값을 현재 인덱스 값과 교체한다.
		// 다음  인덱스에서도 순환 반복 한다.
		
		int[] index = { 5,4,2,1,3,7,8,6};
		int indexMin , temp;
		
		for (int i = 0; i < index.length; i++) {
			indexMin = i ;
			for(int j = i+1 ; j < index.length ; j++) {
				if(index[indexMin] > index[j]) {
					temp = index[indexMin];
					index[indexMin] = index[j];
					index[j] = temp;
				}
			}
		}
		
		for (int  i = 0 ; i < index.length; i++) {
			System.out.println(index[i]);
		}
	}
}
