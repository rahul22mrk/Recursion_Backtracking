/**
 * Author: Rahul Gupta
 * Title: Generate All Subsequences of an Array (Recursive)
 * 
 * Description:
 * This Java program recursively generates and returns all possible subsequences
 * (subsets) of a given integer array. A subsequence is formed by including or
 * excluding each element while preserving the original order.
 *
 * Input Example: arr = {3, 1, 2}
 * Output Example:
 * [
 *   [3, 1, 2],
 *   [3, 1],
 *   [3, 2],
 *   [3],
 *   [1, 2],
 *   [1],
 *   [2],
 *   []
 * ]
 *
 * -------------------------------------------------------------
 * Time Complexity:  O(2^n * n)
 *   - For an array of size n, there are 2^n possible subsequences.
 *   - Each subsequence can take up to O(n) time to copy/store.
 *
 * Space Complexity:
 *   - Auxiliary Stack Space: O(n) due to recursion depth.
 *   - Result Storage Space: O(2^n * n) to store all subsequences.
 * -------------------------------------------------------------
 */

import java.util.*;

public class AllSubsequences {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};

        // Get all subsequences
        List<List<Integer>> result = getAllSubsequences(0, arr, new ArrayList<>());

        // Print the result
        System.out.println("All subsequences:");
        for (List<Integer> seq : result) {
            System.out.println(seq);
        }
    }

    /**
     * Recursive method to generate all subsequences of an integer array.
     *
     * @param index   Current index in the array
     * @param arr     Input array
     * @param current List holding the current subsequence
     * @return List of all subsequences starting from the current index
     */
    static List<List<Integer>> getAllSubsequences(int index, int[] arr, List<Integer> current) {
        // Base case: end of array
        if (index == arr.length) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(current)); // deep copy
            return result;
        }

        // Include current element
        current.add(arr[index]);
        List<List<Integer>> left = getAllSubsequences(index + 1, arr, current);

        // Exclude current element (backtrack)
        current.remove(current.size() - 1);
        List<List<Integer>> right = getAllSubsequences(index + 1, arr, current);

        // Merge left and right results
        left.addAll(right);
        return left;
    }
}
