import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int longest = 0;
        for(int n : set){
            if(!set.contains(n - 1)){
                int count = 1;
                int curr = n;
                while(set.contains(curr + 1)){
                    curr = curr + 1;
                    count = count + 1;
                }
                if(count > longest){
                    longest = count;
                }
            }
        }

        return longest;
    }
}