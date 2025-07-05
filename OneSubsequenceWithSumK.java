/**
 * Author: Rahul Gupta
 * Title: Return One Subsequence with Sum = K (Recursive)
 * 
 * Description:
 * This Java program recursively returns any one valid subsequence (subset)
 * from a given array whose sum equals a target value `k`.
 * 
 * Input Example: arr = {1, 2, 1}, k = 2
 * Output Example (any one valid):
 * One subsequence with sum 2: [1, 1]
 * 
 * -------------------------------------------------------------
 * Time Complexity:  O(2^n)
 *   - Each element has two choices (include or exclude)
 *   - We stop as soon as one valid subsequence is found
 *
 * Space Complexity:
 *   - Stack Space: O(n) due to recursion depth
 *   - Result Storage: O(n) for storing the subsequence
 * -------------------------------------------------------------
 */

import java.util.*;

public class OneSubsequenceWithSumK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;

        List<Integer> result = getOneSubsequence(0, arr, new ArrayList<>(), 0, k);

        if (result != null) {
            System.out.println("One subsequence with sum " + k + ": " + result);
        } else {
            System.out.println("No subsequence found with sum " + k);
        }
    }

    /**
     * Recursively returns any one subsequence whose sum equals the target.
     *
     * @param index      Current index in the array
     * @param arr        Input array
     * @param current    Current subsequence being built
     * @param currentSum Running sum of elements included so far
     * @param target     Target sum to be matched
     * @return A valid subsequence list if found, else null
     */
    static List<Integer> getOneSubsequence(int index, int[] arr, List<Integer> current, int currentSum, int target) {
        if (index == arr.length) {
            if (currentSum == target) {
                return new ArrayList<>(current); // return a copy of the valid subsequence
            }
            return null;
        }

        // Include current element
        current.add(arr[index]);
        List<Integer> left = getOneSubsequence(index + 1, arr, current, currentSum + arr[index], target);
        if (left != null) return left;

        // Backtrack (exclude current element)
        current.remove(current.size() - 1);
        List<Integer> right = getOneSubsequence(index + 1, arr, current, currentSum, target);
        if (right != null) return right;

        return null;
    }
}
