class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int x= 0 ;
        for(Integer i :nums){
            if(h.containsKey(target-i)){
                return new int[]{x , h.get(target-i)};
            }else{
                    h.put(i,x);
                    x++;
            }
        } 
       
        return new int[]{};
    }
}