class Solution {
    public int minMoves(int[] nums) {
        int max =Integer.MIN_VALUE;
        // for(int i =0 ;i<= nums.length-1;i++){
        //     if(nums[i] > max){
        //         max = nums[i];
        //     }
        // }
        // int moves = 0;
        // for(int i =0 ;i<= nums.length-1;i++){
        //     moves  += max - nums[i];
        // }
            int sum = 0;
            for(int i : nums){
                max = Math.max(i , max);
                sum += i;
            }
        return max * nums.length - sum;
    }
}