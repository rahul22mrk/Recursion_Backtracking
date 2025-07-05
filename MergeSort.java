/**
 * Merge Sort Algorithm - Java Implementation
 * 
 * This class provides a static method to sort an integer array using Merge Sort.
 * It follows the divide-and-conquer paradigm to recursively divide the array
 * and merge sorted subarrays.
 *
 * 🔢 Time Complexity:
 *     - Best Case:    O(n log n)
 *     - Average Case: O(n log n)
 *     - Worst Case:   O(n log n)
 *
 * 💾 Space Complexity:
 *     - Auxiliary Space: O(n) due to temporary list used for merging
 *     - Not In-place (uses extra space for merging)
 *
 * Author: Rahul Gupta
 * Date: 2025-07-05
 */

import java.util.*;

public class MergeSort {

    /**
     * Public method to sort the array using merge sort.
     *
     * @param nums The input array to be sorted
     * @return The sorted array
     */
    public static int[] sort(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    // Internal method to perform merge sort on the array
    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;

        // Recursively divide
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        // Merge the sorted halves
        merge(arr, low, mid, high);
    }

    // Merges two sorted subarrays of arr
    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // Merge elements from both halves in sorted order
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        // Add remaining elements from left half
        while (left <= mid) {
            temp.add(arr[left++]);
        }

        // Add remaining elements from right half
        while (right <= high) {
            temp.add(arr[right++]);
        }

        // Copy back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        // Call static sort method from MergeSort class
        MergeSort.sort(arr);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
