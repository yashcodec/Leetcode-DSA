public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int currentVal = nums1[i];
            int nextGreater = -1;
            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == currentVal) {
                    found = true;
                }
                
                if (found && nums2[j] > currentVal) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            result[i] = nextGreater;
        }

        return result;
    }
}