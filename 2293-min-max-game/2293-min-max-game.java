class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int index =0;
        int ans[] =  new int[nums.length/2];
        boolean flag = true;
        for(int i = 0;i<= nums.length-2;i =i+2){
            if(flag){
            int min = Math.min(nums[i] , nums[i+1] );
            ans[index] = min;
                index++;
                flag = false;
            }else{
                int max = Math.max(nums[i] , nums[i+1]);
                ans[index] = max;
                index++;
                flag = true;
            }
        }
        return minMaxGame(ans);
        
    }
}