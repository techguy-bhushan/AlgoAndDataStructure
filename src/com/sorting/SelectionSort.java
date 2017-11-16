package com.sorting;

import com.sorting.util.Util;

/*
* ==============================Details====================================
* Sort the data by finding the smallest item and swapping it into the array in the first unsorted location
* Aldo
* 1.Enumerate the array from the first unsorted item to the end
* 2.Identify the smallest item
* 3.Swap the smallest item with the first unsorted item
** =====================Performance==================================
* Worst case performance: O(n^2)
* ->Not appropriate for large unsorted data set
* Average case performance : O(n^2)
* ->Not appropriate for large unsorted data set
* ->Typically perform better then bubble sort but less then insertion sort
* Best case performance: O(n^2)
* */
public class SelectionSort {
    static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,3,8,9,5};
        sort(arr);
        Util.printArray(arr);
    }
}
