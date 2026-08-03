class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap();
            for(int i :nums){
                int count = h.getOrDefault(i,0);
                count++;
                h.put(i ,count);
            }
            for(Integer i : h.keySet()){
                    if(h.get(i) > (nums.length/2)){
                        return i;
                    }
            }
            return 0;
    }
}