import java.util.*;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // base case

        int oddCount = 0;
        int result = 0;

        for (int num : nums) {

            if (num % 2 == 1) {
                oddCount++;
            }

            if (map.containsKey(oddCount - k)) {
                result += map.get(oddCount - k);
            }

            map.put(oddCount, map.getOrDefault(oddCount, 0) + 1);
        }

        return result;
    }
}