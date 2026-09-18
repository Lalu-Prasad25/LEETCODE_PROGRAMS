class Solution {
    public int findFinalValue(int[] nums, int original) {
        return recursion(nums, original,0);
    }

    public int recursion(int []nums, int original, int i){
        int a= original;
        while(i <= nums.length-1){
            if(original == nums[i]){
                original *= 2;
            }
            i++;
        }
            if(a == original){
                return original;
            }
            return recursion(nums, original , 0);
        }
    
}