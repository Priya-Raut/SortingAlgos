package com.sortingalgos;

import java.util.Arrays;

public class InsertionSort {
    public static int[] sortWithInsertionSort(int[] arr){
        int oldIndex = 0, newIndex = 1, temp = 0, len = arr.length;
        System.out.println(" ### Insertion Sort ### ");
        System.out.println("Before sorting: " + Arrays.toString(arr));
        while(newIndex < len){
            temp = arr[newIndex];
            while(oldIndex >= 0 && temp < arr[oldIndex]){
                arr[oldIndex+1] = arr[oldIndex];
                oldIndex--;
            }
            arr[oldIndex+1] = temp;
            newIndex++; oldIndex = newIndex-1;
            System.out.println("While sorting: " + Arrays.toString(arr));
        }
        System.out.println("After sorting: " + Arrays.toString(arr));
        return arr;
    }
}
