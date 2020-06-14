package com.sortingalgos;

import java.util.Arrays;

public class QuickSort {
   public static int[] sortWithQuickSort(int[] arr){
       System.out.println(" ### Quick Sort ### ");
       System.out.println("Before sorting: " + Arrays.toString(arr));
       quickSort(arr, 0, arr.length-1);
       System.out.println("After sorting: " + Arrays.toString(arr));
       return arr;
   }

   private static void quickSort(int[] arr, int start, int end){
       if(start < end){ //if start > end or start = end, no need to do the following process
           int pivot = partition(arr, start, end);
           quickSort(arr, start, pivot-1); //sort left side of pivot
           quickSort(arr, pivot+1, end); //sort right side of pivot
       }
   }

   private static int partition(int[] arr, int start, int end){
       //consider arr[end] as the pivot initially
       int i = start-1, j = start, temp = 0;
       while(j < end){
           if(arr[j] < arr[end]){ //lesser element should be towards the start/left
               i++;
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
           j++;
       }
       temp = arr[end];
       arr[end] = arr[i+1];
       arr[i+1] = temp;
       // return pivot which seats at a fixed position
       // with lesser elements to the left
       // with greater elements to the right
       System.out.println("While sorting: " + Arrays.toString(arr));
       return i+1;
   }
}
