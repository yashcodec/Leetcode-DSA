class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        for (int p : cardPoints) totalSum += p;
        int windowSize = n - k;
        if (windowSize == 0) return totalSum;
        int currentWindowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            currentWindowSum += cardPoints[i];
        }
        int minSubarraySum = currentWindowSum;
        for (int i = windowSize; i < n; i++) {
            currentWindowSum += cardPoints[i] - cardPoints[i - windowSize];
            minSubarraySum = Math.min(minSubarraySum, currentWindowSum);
        }
        
        return totalSum - minSubarraySum;
    }
}
