package com.sortingalgos;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sortWithSelectionSortAlgo(int[] arr){
        System.out.println(" ### Selection Sort ### ");
        System.out.println("Before sorting: " + Arrays.toString(arr));
        int minIndex, len = arr.length, temp;
        for(int i = 0; i < len; i++){
            minIndex = i;
            for(int j = i+1; j < len; j++){
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap smallest element with ith element
            temp = arr[minIndex] ;
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println("While sorting: " + Arrays.toString(arr));
        }
        System.out.println("After sorting: " + Arrays.toString(arr));
        return arr;
    }
}
