package com.sortingalgos;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sortWithSelectionSortAlgo(int[] arr){
        System.out.println(" ### Selection Sort ### ");
        System.out.println("Before sorting: " + Arrays.toString(arr));
        int startIndex = 0, minIndex = 0, len = arr.length, i = 1, temp = 0;
        while(startIndex < len){
            while(i < len){
                if(arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
                i++;
            }
            //swap smallest element with startIndex's element
            temp = arr[minIndex] ;
            arr[minIndex] = arr[startIndex];
            arr[startIndex] = temp;

            minIndex = ++startIndex;
            i = startIndex+1;
            System.out.println("While sorting: " + Arrays.toString(arr));
        }
        System.out.println("After sorting: " + Arrays.toString(arr));
        return arr;
    }
}
