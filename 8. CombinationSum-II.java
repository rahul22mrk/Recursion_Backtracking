/**
 * Author: Rahul Gupta
 * Title: Combination Sum II (LeetCode 40)
 * 
 * Description:
 * Given a collection of candidate numbers (candidates) and a target number (target), 
 * find all unique combinations in candidates where the candidate numbers sum to target.
 * Each number in candidates may **only be used once**, and the solution set must not contain duplicates.
 * 
 * Approach:
 * - Sort the array to easily skip duplicates.
 * - Use backtracking with index-based for-loop.
 * - Skip over duplicate values at the same recursion level.
 * 
 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * Output:
 * [
 *   [1,1,6],
 *   [1,2,5],
 *   [1,7],
 *   [2,6]
 * ]
 * 
 * -------------------------------------------------------------
 * Time Complexity:  O(2^n)
 *   - In worst case, we try all subsets.
 * 
 * Space Complexity:
 *   - Auxiliary Stack Space: O(n) recursion depth
 *   - Result Storage Space: depends on number of valid combinations
 * -------------------------------------------------------------
 */

import java.util.*;

public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort to handle duplicates and break early for large numbers
        Arrays.sort(candidates);

        // Start backtracking
        findUniqueCombinations(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void findUniqueCombinations(int index, int[] candidates, int target,
                                        List<Integer> current, List<List<Integer>> result) {
        // Base case: target matched
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            // Skip duplicates at the same recursion level
            if (i > index && candidates[i] == candidates[i - 1]) continue;

            // Early stopping if the number is too big
            if (candidates[i] > target) break;

            // Include current number
            current.add(candidates[i]);

            // Move to next index (each element used at most once)
            findUniqueCombinations(i + 1, candidates, target - candidates[i], current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}

🌳 Recursion Tree Diagram (Combination Sum II)
candidates = [1, 1, 2]
target = 3
                                   [] (target = 3, index = 0)
                                 /       |         \
                           pick 1     skip dup    pick 2
                             |                        |
                   [1] (t=2, i=1)                [2] (t=1, i=3) ❌
                    /       \
               pick 1      pick 2
                 |            |
      [1,1] (t=1, i=2)     [1,2] ✅
           |
        pick 2
           |
  [1,1,2] (t=-1, i=3) ❌

