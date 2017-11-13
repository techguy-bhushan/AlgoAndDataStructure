package com.shorting;
/*
*
* ==============================Details====================================
* Simplest sorting algorithm
* On Each pass:
* 1.Compare each array iteam to it's tight neighbor
* 2.If the right neighbour is smiller then Swap right and left
* 3. Repeat for the remaining array items
* Perform subsequent passes until no swap are performed
* ============================Performance=======================================
* Worst case performance: O(n2)
* ->Not appropriate for large unsorted data set
* Average case performance : O(n2)
* ->Not appropriate for large unsorted data set
* Best case performance: O(n)
* ->Very googd best case performance and can efficiently sort smalland nearly sorted data set
* */
public class BubbleSort {
    /* Sort array */
    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
        bubbleSort(testData);
        printArray(testData);
    }
}
