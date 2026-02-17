import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            int remainder = total % k;

            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) > 1) return true;
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }
}