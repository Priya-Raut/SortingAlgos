package com.sortingalgos;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sortWithBubbleSortAlgo(int[] arr){
        System.out.println(" ### Bubble Sort ### ");
        System.out.println("Before sorting: " + Arrays.toString(arr));
        int len = arr.length, i=0, j=i+1, temp = 0;
        while(len > 1){
            while(j < len){
                if(arr[i] > arr[j]){
                    //swap items
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++; j++;
            }
            System.out.println("While Sorting: " + Arrays.toString(arr));
            i = 0; j= i+1; len--;
        }
        System.out.println("After sorting: " + Arrays.toString(arr));
        return arr;
    }

}
