/**
 * Author: Rahul Gupta
 * Title: Subsets II – Unique Subsets with Duplicates (Backtracking)
 * 
 * Description:
 * This Java program generates all possible unique subsets (the power set) 
 * of a given integer array that may contain duplicates.
 * 
 * The input array is sorted first to group duplicates together, 
 * and during backtracking, we skip any duplicate elements at the same recursion level 
 * to avoid duplicate subsets in the result.
 * 
 * Input Example: nums = [1, 2, 2]
 * Output Example:
 * [
 *   [],
 *   [1],
 *   [1, 2],
 *   [1, 2, 2],
 *   [2],
 *   [2, 2]
 * ]
 * 
 * -------------------------------------------------------------
 * Time Complexity:  O(2^n)
 *   - Generates all subsets. Duplicate-checking is done with sorting and a skip condition.
 *
 * Space Complexity:
 *   - Auxiliary Stack Space: O(n) (due to recursion depth)
 *   - Result Storage Space: O(2^n * n) (for all subsets)
 * -------------------------------------------------------------
 */

import java.util.*;

public class SubsetsWithDup {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);  // Sort to handle duplicates
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void findSubsets(int ind, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(current));  // Add current subset to result

        for (int i = ind; i < nums.length; i++) {
            // Skip duplicates at the same recursion level
            if (i > ind && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);                       // Include nums[i]
            findSubsets(i + 1, nums, current, ans);     // Recurse
            current.remove(current.size() - 1);         // Backtrack
        }
    }

    public static void main(String[] args) {
        SubsetsWithDup solution = new SubsetsWithDup();
        int[] nums = {1, 2, 2};
        List<List<Integer>> result = solution.subsetsWithDup(nums);
        System.out.println("Unique subsets: " + result);
    }
}
