package com.shorting;
/*
*======================Details========================
* Sorts each item in the array as they are encountered
* As the current item works from left to right
* -> Everything left of the item is known to be sorted
* -> Everything to the right is unsorted
* The current item is 'inserted' into place within the sorted section
* =====================Performance==================================
* Worst case performance: O(n2)
* ->Not appropriate for large unsorted data set
* Average case performance : O(n2)
* ->Not appropriate for large unsorted data set
* Best case performance: O(n)
* ->Very googd best case performance and can efficiently sort smalland nearly sorted data set

* */
public class InsertionSort {
    /* Sort array */
    static void insertionSort(int arr[]) {
        int total = 0;
       for (int i = 1 ; i < arr.length; i++) {
           total++;
            int currentIndex = i;
            while (currentIndex > 0 && arr[currentIndex] < arr[currentIndex - 1] ) {
                total++;
                int swap = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex - 1];
                arr[currentIndex - 1] = swap;
                currentIndex--;
            }
       }
        System.out.println("==================>"+total);
    }

    /* Prints the array */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[]  testData = {7,4,3,8,9,5};
        insertionSort(testData);
        printArray(testData);
    }
}
