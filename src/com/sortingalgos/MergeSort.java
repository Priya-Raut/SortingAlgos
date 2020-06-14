package com.sortingalgos;

import java.util.Arrays;

public class MergeSort {
    public static int[] sortWithMergeSort(int[] arr){
        System.out.println("Before sorting: " + Arrays.toString(arr));
        int[] result = split(arr, 0, arr.length-1);
        System.out.println("after sorting: " + Arrays.toString(arr));
        return result;
    }

    public static int[] split(int[] arr, int start, int end){
        if(start == end){
            return arr;
        }
        int mid = (end-start)/2;
        int[] left = split(arr, start, mid);
        int[] right = split(arr, mid+1, end);
        return merge(left,right);
    }

    public static int[] merge(int[] left, int[] right){
        int lLen = left.length;
        int rLen = right.length;
        int[] temp = new int[lLen+rLen];
        int k = 0, i = 0, j = 0;
        while(i < lLen && j < rLen && k < temp.length){
            if(left[i] < right[j]){
                temp[k++] = left[i];
                i++;
            }else{
                temp[k++] = right[j];
                j++;
            }
        }
        while(i < lLen) temp[k++] = left[i++];
        while(j < rLen) temp[k++] = right[j++];
        return temp;
    }
}
