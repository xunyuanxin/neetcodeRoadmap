package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    private final List<List<Integer>> output = new ArrayList<>();
    private int n;

    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        output.add(new ArrayList<>(curr));
        for (int i = first; i < n; i++) {
            curr.add(nums[i]);
            backtrack(i + 1, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        ArrayList<Integer> currCombo = new ArrayList<Integer>();
        backtrack(0, currCombo, nums);
        return output;
    }
}
