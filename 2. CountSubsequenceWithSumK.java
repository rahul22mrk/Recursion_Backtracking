// CountSubsequenceWithSumK.java
// Problem: Count total number of subsequences whose sum equals to target K
// Author: Rahul Gupta

import java.util.*;

public class CountSubsequenceWithSumK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;
        int result = countSubsequences(0, arr, 0, k);
        System.out.println("Total subsequences with sum " + k + ": " + result);
    }

    static int countSubsequences(int index, int[] arr, int currentSum, int target) {
        if (index == arr.length) {
            return currentSum == target ? 1 : 0;
        }

        // Include current element
        int include = countSubsequences(index + 1, arr, currentSum + arr[index], target);

        // Exclude current element
        int exclude = countSubsequences(index + 1, arr, currentSum, target);

        return include + exclude;
    }
}
