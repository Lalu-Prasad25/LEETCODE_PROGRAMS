class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int nearest = Integer.MAX_VALUE;int difference =Integer.MAX_VALUE;
        for(int i = 0;i<=nums.length-1;i++){
            for(int j =i+1;j<=nums.length-1;j++){
                for(int k = j+1 ;k<=nums.length-1;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(  Math.abs(sum -target) < difference ){
                            nearest = sum;
                            difference = Math.abs(sum -target);

                    }
                }
            }
        }
        return nearest;
    }
}