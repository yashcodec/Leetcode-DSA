import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {

        // key = bit count, value = list of numbers
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: group numbers by bit count
        for (int num : arr) {
            int bits = countBits(num);
            
            if (!map.containsKey(bits)) {
                map.put(bits, new ArrayList<>());
            }
            
            map.get(bits).add(num);
        }

        // Step 2: sort keys (bit counts)
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        // Step 3: build result
        int index = 0;
        for (int key : keys) {
            List<Integer> list = map.get(key);
            Collections.sort(list); // sort numbers with same bit count
            
            for (int num : list) {
                arr[index++] = num;
            }
        }

        return arr;
    }

    // manual bit count
    private int countBits(int num) {
        int count = 0;
        while (num > 0) {
            count += (num & 1);
            num >>= 1;
        }
        return count;
    }
}