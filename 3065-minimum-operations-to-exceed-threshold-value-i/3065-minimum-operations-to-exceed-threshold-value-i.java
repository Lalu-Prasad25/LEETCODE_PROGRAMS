class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<= nums.length-1;i++){
            if(nums[i]<k){
                    count++;
            }
        }
        return count;
    }
}