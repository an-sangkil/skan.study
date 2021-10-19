package com.algorithm;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		/*
		버블 소팅. n(n^2) 번으로  값을 비교하여 정리한다.
		연속된 두개 인덱스를 비교하여, 정한 기준값을 뒤로 넘겨 정렬하는 방법이다.
		오름차순으로 정렬하고자 할경우, 비교시마다 가장 큰값이 뒤로 이동하며, 1바퀴 돌았을때 가장 큰값이 끝에 위치한다.
		마지막에 큰값이 저장되기 때문에 n-1 반복 순환해주면 원하는 값으로 정렬이된다.
		
		이정렬 알고리즘은 n-1, n-2 ..... 1개씩 비교를 반복하며 정렬해나간다.
		전체비교를 진행함으로 시간 복잡도는 높은  O(n^2)이다.
		공간복잡도는 하나의 배열에서만 진행함으로 O(n)이다.
		*/
		
		// 인덱스 배열을 선언하여 무작위 값을 만든다.
		// 기본정보 값으로 인덱스를 반복한다.
		// 순환반복이 필요한 값을 지정하여, 순환반복한다. 이는 기본 정보값 length 에 -i 값으로  순환이 한번씩 될때마다 (n-1) 해준다.
		
		
		int[] index = { 5,4,2,1,3,7,8,6};
		int temp;
		for (int i = 0; i < index.length-1; i++) {
			
			for (int j = 0; j < index.length-1-i; j++) {
				// 인덱스 비교값을 반대로 치환해주면 역순정렬로 바뀐다.
				if(index[j] < index[j+1]) {
					temp = index[j];
					index[j] = index[j+1];
					index[j+1] = temp;
					
				}
			}
		}
		
		for (int i = 0 ; i < index.length; i++) {
			System.out.println(index[i]);
		}
	}
}
