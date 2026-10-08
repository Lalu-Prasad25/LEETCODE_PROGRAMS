class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []pos = new int[nums.length/2];
        int []neg = new int[nums.length/2];
        int j =0,k=0;
        for(int i =0;i<=nums.length-1;i++){
            if(nums[i] > 0){
                pos[j] = nums[i];
                j++;
            }else{
                neg[k]= nums[i];
                k++;
            }
        }
            int index=0;
            for(int i=0;i<=pos.length-1;i++){
                nums[index]= pos[i];
                index++;
                nums[index]= neg[i];
                index++;
            }
        
        return nums;
    }
}