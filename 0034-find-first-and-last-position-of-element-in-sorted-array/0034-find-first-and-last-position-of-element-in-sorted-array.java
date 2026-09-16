class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = -1 , right =-1;
        int i = 0 , j = nums.length-1;
        while(i <= j){
            int mid = i +(j-i)/2;
            if(nums[mid]==target){
                    left = mid;
                    j = mid-1;
            }else if(nums[mid] < target){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        i = 0 ; j = nums.length-1;
        while(i <= j){
            int mid = i +(j-i)/2;
            if(nums[mid]==target){
                    right = mid;
                    i = mid+1;
            }else if(nums[mid] < target){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return new int[]{left ,right};
    }
}
