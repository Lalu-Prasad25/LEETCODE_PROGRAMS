class Solution {
    public int maxSubArray(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        int i, maxx = dp[0];
        for(i =1 ; i<= nums.length-1;i++){
            dp[i] = Math.max(dp[i-1]+nums[i] , nums[i]);
            maxx = Math.max(dp[i], maxx);
        }

        return maxx;
    }
}