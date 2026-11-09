class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> h =  new HashMap();
        for(int i =0 ;i<=nums.length-1;i++){
            h.put(nums[i],i);
        }
        for(int i =0;i<=operations.length-1;i++){
                if(h.containsKey(operations[i][0])){
                    int value = h.remove(operations[i][0]);
                    h.put(operations[i][1] , value);
                }
            }
        
        int []ans= new int[nums.length];
        for(int i : h.keySet()){
            ans[h.get(i)] = i;
        }
        return ans;
    }
}