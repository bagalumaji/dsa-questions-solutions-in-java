package com.bagal.interview;

import java.util.Arrays;

//input - 0, 2, 1, 0, -9, 0, 5, 0, 6, -2, 7, -5, 0, 3
//output- 0, 0, 0, 0, 0, -2, -5, -9, 1, 2, 3, 5, 6, 7
public class SortPositiveNegativeAndZero {
    public static int[] sortPositiveNegativeAndZero(int []arr){
        Arrays.sort(arr);
        int end = arr.length-1;
        int start = 0;
        while (arr[end]!=0){
            end--;
        }
        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
