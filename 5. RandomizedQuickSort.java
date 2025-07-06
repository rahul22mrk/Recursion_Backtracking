import java.util.*;

public class RandomizedQuickSort {

    // Main function
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        quickSort(arr);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }

    // Quick Sort wrapper
    public static void quickSort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
    }

    // Recursive helper function
    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSortHelper(arr, low, partitionIndex - 1);
            quickSortHelper(arr, partitionIndex + 1, high);
        }
    }

    // Partition using randomized pivot (Hoare-style)
    private static int partition(int[] arr, int low, int high) {
        // Choose random pivot and move to start
        int randomIndex = low + new Random().nextInt(high - low + 1);
        swap(arr, low, randomIndex);

        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high - 1 && arr[i] <= pivot) i++;
            while (j >= low + 1 && arr[j] > pivot) j--;

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j); // Place pivot in correct position
        return j;
    }

    // Swap utility
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
