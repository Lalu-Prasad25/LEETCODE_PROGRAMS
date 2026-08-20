class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap();
        for(Integer i: nums){
            if(h.containsKey(i)){
                int count = h.get(i);
                count++;
                h.put(i,count);
            }else{
                h.put(i,1);
            }
        }
            for(Integer x :h.keySet()){
                if(h.get(x) == 1){
                    return x;
                }
            }
            return -1;
        
    }
}