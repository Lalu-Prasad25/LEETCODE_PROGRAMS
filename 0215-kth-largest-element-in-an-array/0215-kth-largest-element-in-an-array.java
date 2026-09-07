class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        // for(int i =0 ; i<=nums.length-1 ; i++){
        //     for(int j =i+1 ; j<= nums.length-1; j++){
        //         if(nums[i] > nums[j]){
        //             int temp = nums[i];
        //             nums[i]= nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }
        return nums[nums.length-k];
    }
}