/**
 * Author: Rahul Gupta
 * Title: Subset Sum I – Return All Subset Sums (Recursive)
 * 
 * Description:
 * This Java program recursively generates the sum of all possible subsets of the given array.
 * For each element, it makes two choices: include or exclude. This forms 2^n subsets,
 * and their sums are collected in a result list.
 * 
 * Input Example: nums = {1, 2, 3}
 * Output Example: [6, 5, 4, 3, 3, 2, 1, 0]
 * (Note: Order may vary depending on recursion flow)
 * 
 * -------------------------------------------------------------
 * Time Complexity:  O(2^n)
 *   - For n elements, 2^n subsets are possible.
 * 
 * Space Complexity:
 *   - Auxiliary Stack Space: O(n) (due to recursion depth)
 *   - Result Storage Space: O(2^n) (for all subset sums)
 * -------------------------------------------------------------
 */

import java.util.ArrayList;
import java.util.List;

public class SubsetSums {

    public List<Integer> subsetSums(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        // Start recursion from index 0 with sum = 0
        func(0, 0, nums, ans);
        return ans;
    }

    private void func(int ind, int sum, int[] nums, List<Integer> ans) {
        if (ind == nums.length) {
            ans.add(sum);
            return;
        }

        // Include current element
        func(ind + 1, sum + nums[ind], nums, ans);

        // Exclude current element
        func(ind + 1, sum, nums, ans);
    }

    public static void main(String[] args) {
        SubsetSums sol = new SubsetSums();
        int[] nums = {1, 2, 3};
        List<Integer> result = sol.subsetSums(nums);

        System.out.println("Subset sums are: " + result);
    }
}
