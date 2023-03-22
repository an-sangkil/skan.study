package com.algorithm;

public class BianrySearch {

  public static void main(String[] args) {
    int[] index = { 5, 4, 2, 1, 3, 7, 8, 6 };
    //Arrays.sort(index);
    int temp, min;
    for (int i = 0; i < index.length; i++) {
      min = i;
      for (int j = i + 1; j < index.length; j++) {
        if (index[j] < index[min]) {
          min = j;
        }
      }

      temp = index[min];
      index[min] = index[i];
      index[i] = temp;
    }

    for (int i = 0; i < index.length; i++) {
      System.out.println(index[i]);
    }

    int key = 4;
    int first = 0;
    int last = index.length;
    int mid;
    while (first <= last) {
      mid = (first + last) / 2;
      if (key == index[mid]) {
        System.out.println("index[mid] = " + index[mid]);
        break;
      } else {
        if (key > index[mid]) {
          first = mid + 1;
        } else {
          last = mid - 1;
        }
      }
    }
  }
}
