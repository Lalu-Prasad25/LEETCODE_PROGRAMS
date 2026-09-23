class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxCount = 1;
        int minCount = 1;
        for(int i = 0; i <= nums.length - 2; i++) {
            if(nums[i] + 1 == nums[i + 1]) {
                maxCount++;
            }
            else if(nums[i] == nums[i + 1]) {
                continue;
            }
            else {
                if(maxCount > minCount) {
                    minCount = maxCount;
                }
                maxCount = 1;
            }
        }
        return Math.max(maxCount, minCount);
    }
}