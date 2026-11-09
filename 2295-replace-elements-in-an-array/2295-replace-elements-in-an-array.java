class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> h =  new HashMap();
        for(int i =0 ;i<=nums.length-1;i++){
            h.put(nums[i],i);
        }
        
        for(int i =0;i<=operations.length-1;i++){
                    int value = h.remove(operations[i][0]);
                    nums[value] = operations[i][1];
                    h.put(operations[i][1] , value);
            }
        
    
        return nums;
    }
}