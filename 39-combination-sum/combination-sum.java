import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList<>(), candidates, target, 0);
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> currentCombination, int[] candidates, int remaining, int index) {
        if (remaining < 0) {
            return;
        } else if (remaining == 0) {
            results.add(new ArrayList<>(currentCombination));
        } else {
            for (int i = index; i < candidates.length; i++) {
                currentCombination.add(candidates[i]);
                backtrack(results, currentCombination, candidates, remaining - candidates[i], i);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }
}
