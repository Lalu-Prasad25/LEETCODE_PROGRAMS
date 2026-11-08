
class Solution {
    public int minCapability(int[] nums, int k) {

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find minimum and maximum house values
        for (int i = 0; i < nums.length; i++) {
            low = Math.min(low, nums[i]);
            high = Math.max(high, nums[i]);
        }

        // Binary Search on capability
        while (low <= high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            // Check how many non-adjacent houses we can rob
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] <= mid) {
                    count++;
                    i++; // Skip the adjacent house
                }
            }

            if (count >= k) {
                high = mid - 1; // Try smaller capability
            } else {
                low = mid + 1;  // Try larger capability
            }
        }

        return low;
    }
}
