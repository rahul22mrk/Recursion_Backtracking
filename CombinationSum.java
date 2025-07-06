/**
 * Author: Rahul Gupta
 * Title: Combination Sum Using Recursion and Backtracking
 * 
 * Description:
 * This Java program finds all unique combinations of elements from a given 
 * integer array `candidates` that sum up to a given target.
 * Each number in candidates may be used an unlimited number of times.
 *
 * Approach:
 * The solution uses recursive backtracking to explore all possibilities by:
 * - Including the current element (stay at the same index).
 * - Excluding the current element (move to the next index).
 *
 * Input Example:
 * candidates = [2, 3], target = 5
 *
 * Output Example:
 * [
 *   [2, 3]
 * ]
 *
 * -------------------------------------------------------------
 * Time Complexity:  O(2^T) to O(k^T)
 *   - T = target value
 *   - k = number of candidates <= target
 *   - Each recursive call tries multiple paths, creating exponential growth.
 *
 * Space Complexity:
 *   - Auxiliary Stack Space: O(T) due to recursion depth (worst case).
 *   - Result Storage Space: Depends on number of valid combinations,
 *     up to O(k^T * T) in worst case.
 * -------------------------------------------------------------
 */

import java.util.*;

public class CombinationSum {

    // Main method to return all valid combinations
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    // Recursive backtracking method
    private static void findCombinations(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {

        // Debug print to visualize recursion tree (optional)
        System.out.println("Index: " + index + ", Target: " + target + ", Current: " + current);

        // Valid combination found
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Invalid case
        if (index == candidates.length || target < 0) {
            return;
        }

        // Include current candidate
        current.add(candidates[index]);
        findCombinations(index, candidates, target - candidates[index], current, result);

        // Backtrack
        current.remove(current.size() - 1);

        // Skip current candidate
        findCombinations(index + 1, candidates, target, current, result);
    }

    // Driver code
    public static void main(String[] args) {
        int[] candidates = {2, 3};
        int target = 5;

        List<List<Integer>> res = combinationSum(candidates, target);
        System.out.println("\nResult Combinations:");
        for (List<Integer> comb : res) {
            System.out.println(comb);
        }
    }
}

candidates = [2, 3], target = 5
🌳 Recursion Tree Format (with index, target, and current)
    candidates = [2, 3]

                                      (i=0, t=5, curr=[])
                                      /                   \
                        take 2                            skip 2
                           |                                 |
                  (i=0, t=3, curr=[2])              (i=1, t=5, curr=[])
                   /                \                    /              \
            take 2               skip 2           take 3            skip 3
              |                    |                 |                  |
  (i=0, t=1, curr=[2,2])   (i=1, t=3, curr=[2])   (i=1, t=2, curr=[3])  (X)
        /      \               /       \            /      \
   take2    skip2       take3     skip3     take3     skip3
     |         |            |         |         |         |
(i=0,t=-1,[2,2,2]) ❌  (i=1,t=1,[2,2])  (i=1,t=0,[2,3]) ✅  (i=2,t=3,[2])❌  (i=1,t=-1,[3,3])❌  (i=2,t=2,[3])❌

