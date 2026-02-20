class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for (int p : piles) if (p > right) right = p;

        int res = right;
        while (left <= right) {
            int k = left + (right - left) / 2;
            long total = 0;
            for (int p : piles) total += (long)(p + k - 1) / k;

            if (total <= h) {
                res = k;
                right = k - 1; 
            } else {
                left = k + 1; 
            }
        }
        return res;
    }
}