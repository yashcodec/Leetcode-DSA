class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return new int[0];
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        for (int i = 0; i < n; i++) {
            leftMax[i] = (i % k == 0) ? nums[i] : Math.max(leftMax[i - 1], nums[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            rightMax[i] = (i == n - 1 || (i + 1) % k == 0) ? nums[i] : Math.max(rightMax[i + 1], nums[i]);
        }
        int[] result = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            result[i] = Math.max(rightMax[i], leftMax[i + k - 1]);
        }
        return result;
    }
}