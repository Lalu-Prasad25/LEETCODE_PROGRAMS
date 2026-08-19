class Solution {
    public int pivotIndex(int[] nums) {
        int i=0 ,j; 
        int leftSum, rightSum;
        while (i <= nums.length-1){
            leftSum=0 ;
            for(int k = 0; k<i;k++){
                leftSum = leftSum+ nums[k];
            }
            rightSum=0;
            for(j = i+1; j<= nums.length-1;j++){
                    rightSum= rightSum+ nums[j];
            }
            if(leftSum == rightSum){
                return i;
            }
            i++;
        }
        return -1;
    }
}