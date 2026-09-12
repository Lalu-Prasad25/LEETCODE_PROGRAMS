class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum  , max =Integer.MIN_VALUE;
        for(int i = 0 ;i<= nums.length-k;i++){
            sum = 0;
            for(int j = i ; j < i+k ;j++){
                sum = sum +nums[j];
            }
            if(max < sum){
                max = sum;
            }
        }
        
        return (double)max/k;
    }
}