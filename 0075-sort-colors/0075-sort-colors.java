class Solution {
    public void sortColors(int[] nums) {
        int red =0;
        int white=0;
        int blue=0;
      for(int i:nums){
            if(i==0){
                red++;
            }
             if(i==1){
                white++;
            }
             if(i==2){
                blue++;
            }
      }
      int index =0;
      while(red!=0){
        nums[index]=0;
        index++;
        red--;
      }
       while(white!=0){
        nums[index]=1;
        index++;
        white--;
      }
      while(blue!=0){
        nums[index]=2;
        index++;
        blue--;
      }
    }
}