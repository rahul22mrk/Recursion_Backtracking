/**
 * Author: Rahul Gupta
 * Title: Generate All Subsequences with Sum = K (Recursive)
 * 
 * Description:
 * This Java program recursively generates and returns all subsequences (subsets)
 * of a given integer array whose sum is exactly equal to a given target value `k`.
 * 
 * Input Example: arr = {1, 2, 1}, k = 2
 * Output Example:
 * [
 *   [1, 1],
 *   [2]
 * ]
 *
 * -------------------------------------------------------------
 * Time Complexity:  O(2^n * n)
 *   - Each element has 2 choices (include/exclude) → 2^n subsequences
 *   - Copying each valid subsequence costs up to O(n)
 *
 * Space Complexity:
 *   - Auxiliary Stack Space: O(n) for recursion depth
 *   - Result Storage Space: O(2^n * n) in worst case (if all match)
 * -------------------------------------------------------------
 */

import java.util.*;

public class SubsequenceWithSumK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;

        List<List<Integer>> result = getAllSubsequences(0, arr, new ArrayList<>(), 0, k);

        System.out.println("Subsequences with sum = " + k + ":");
        for (List<Integer> seq : result) {
            System.out.println(seq);
        }
    }

    /**
     * Recursively generates all subsequences whose sum equals the target.
     *
     * @param index      Current index in the array
     * @param arr        Input array
     * @param current    Current subsequence being built
     * @param currentSum Current sum of elements in the current subsequence
     * @param target     Target sum to match
     * @return List of all valid subsequences with sum == target
     */
    static List<List<Integer>> getAllSubsequences(int index, int[] arr, List<Integer> current, int currentSum, int target) {
        if (index == arr.length) {
            List<List<Integer>> result = new ArrayList<>();
            if (currentSum == target) {
                result.add(new ArrayList<>(current)); // deep copy of current list
            }
            return result;
        }

        // Include current element
        current.add(arr[index]);
        List<List<Integer>> left = getAllSubsequences(index + 1, arr, current, currentSum + arr[index], target);

        // Backtrack (exclude current element)
        current.remove(current.size() - 1);
        List<List<Integer>> right = getAllSubsequences(index + 1, arr, current, currentSum, target);

        // Combine both include and exclude results
        left.addAll(right);
        return left;
    }
}
