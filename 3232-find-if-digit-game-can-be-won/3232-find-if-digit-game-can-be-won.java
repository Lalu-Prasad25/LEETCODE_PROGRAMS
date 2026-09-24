class Solution {
    public boolean canAliceWin(int[] nums) {
        int alice =0;
        int bob =0;
        for(int i =0 ;i<= nums.length-1;i++){
            if(nums[i] > 9){
                alice += nums[i];
            }else{
                bob = bob + nums[i];
            }
        }
        
        return bob != alice;
    }
}