class Solution {
    public int[] transformArray(int[] nums) {
        int count=0;
            for(int i =0;i<= nums.length-1;i++){
                if(nums[i]%2==0){
                    nums[i]=0;
                    count++;
                }else{
                    nums[i]= 1;
                }
            }
            for(int i =0;i<= count-1;i++){
                nums[i] = 0;
             }
              for(int i =count;i<=nums.length-1;i++){
                nums[i] = 1;
             }
            
            return nums;
    }
}