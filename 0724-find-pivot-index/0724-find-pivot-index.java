class Solution {
    public int pivotIndex(int[] nums) {
       int preSum[] = new int[nums.length];
       int i;
       preSum[0] = nums[0];
       for( i=1;i<=nums.length-1;i++){
        preSum[i] = preSum[i-1]+ nums[i];
       }
       if(preSum[nums.length-1] == preSum[0]){
        return 0;
       }
       for( i = 1; i<=nums.length-1;i++){
        if(preSum[i-1] == ( preSum[nums.length-1])- preSum[i]){
            return i;
        }
        }
       
        return -1;
    }
}