import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // 1. Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // 2. Skip duplicate elements for the first position
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Optimization: If the smallest possible sum is > 0, stop
            if (nums[i] > 0) break;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // 3. Skip duplicates for left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum too small, move left pointer to increase it
                    left++;
                } else {
                    // Sum too large, move right pointer to decrease it
                    right--;
                }
            }
        }
        return res;
    }
}