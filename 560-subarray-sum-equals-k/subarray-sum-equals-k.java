import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); 
        map.put(0, 1); 
        for (int num : nums) {
            prefixSum += num;
             int removeSum = prefixSum - k;
            if (map.containsKey(removeSum)) {
                count += map.get(removeSum);
            }
            
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
        public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        
        Solution obj = new Solution();
        System.out.println("Total subarrays: " + obj.subarraySum(nums, k)); 
    }
}