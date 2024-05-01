package DSA;

public class Sorting {

    // Start from the beginning of the list.
    // Compare the first two elements. If the first one is greater than the second one, swap them.
    // Move to the next pair of elements, and continue comparing and swapping until you reach the end of the list.
    // Repeat this process for each element in the list until no more swaps are needed.
    // At this point, the list is sorted.
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // traverse through the array
        // 3, 1, 8, 2, 9, 10, 68
        for (int i = 0; i < n-1; i++) {

            // compare each value with next value
            for (int j = 0; j < n-i-1; j++) {

                // check if the current value is greater than the next value
                if (arr[j] > arr[j+1]) {

                    // grab the current value
                    int temp = arr[j];
                    // the current value should be in the next position because is greater
                    arr[j] = arr[j+1];
                    // now the next is swapped back to cuurent value position
                    arr[j+1] = temp;

                }
            }
        }
    }

    // Start from the second element in the list.
    // Compare the current element with the elements before it, moving backward.
    // If the current element is smaller, shift the larger elements one position to the right.
    // Repeat this process until you find the correct position for the current element.
    // Move to the next element and repeat the process until the entire list is sorted.
    static void insertionSort(int[] arr) {

        // traverse through the array
        // 3, 1, 8, 2, 9, 10, 68
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i]; // current value to be compared with left side
            int j = i - 1; // going to the left

            // if both true continue comparing until it's position, and then swap
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--; // continue decrementing to the left
            }
            // leave the value as it is either is false
            arr[j+1] = temp;
        }
    }

    // Start from the beginning of the list.
    // Find the smallest element in the list.
    // Swap it with the first element.
    // Move to the second element and repeat the process of finding the smallest element among the remaining elements and swapping it with the current position.
    // Continue this process until the entire list is sorted.
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        
        // 3, 1, 8, 2, 9, 10, 68
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i; // this box holds the minimum value
            for (int j = i+1; j < n; j++) {
                // if descending == true then <
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i]; // swap with the first element
            arr[i] = temp; 
        }
    }

    // Choose a pivot element from the list (usually the last element).
    // Partition the list into two sub-lists: one containing elements smaller than the pivot and the other containing elements larger than the pivot.
    // Recursively apply quick sort to the sub-lists.
    // Combine the sorted sub-lists and the pivot to get the final sorted list.
    private static void quickSort(int[] arr, int start, int end) {
        if (end <= start) return; // base case

        int pivot  = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        // 3, 8, 6, 4, 9, 10
        // 0, 1, 2, 3, 4, 5(pivot initially)
        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }

    // Divide the unsorted list into two halves.
    // Recursively sort each half.
    // Merge the sorted halves back together.
    // To merge, compare the elements from each half and place them in order into a new list.
    // Continue this process until all elements are merged back together in sorted order.
    private static void mergeSort(int[] arr) {
        int length = arr.length;

        if (length <= 1) return;

        int middle = length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array

        for (; i < length; i++) {
            if (i < middle) {
                
            }
        }
    }

    public static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 8, 2, 9, 4, 6, 5};
        System.out.println("Original array: ");
        printArray(arr);

        // bubbleSort(arr);
        // insertionSort(arr);
        // selectionSort(arr);
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
