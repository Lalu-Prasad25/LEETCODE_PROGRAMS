class Solution {
    public int missingNumber(int[] nums) {
    int n = nums.length ,curSum = 0 , actSum = 0;
    for(int i = 0; i < n ; i++ ){
        actSum += nums[i]; 
    }
    curSum = n * (n+1)/2;
    return curSum-actSum;
}}