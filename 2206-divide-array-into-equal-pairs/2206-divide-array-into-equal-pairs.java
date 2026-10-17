class Solution {
    public boolean divideArray(int[] nums) {
    //     HashMap<Integer,Integer> h= new HashMap();
    //     for(int i : nums) {
    //         h.put(i, h.getOrDefault(i, 0) + 1);
    //     }
    //     for(Integer i:h.keySet()){
    //         if(h.get(i) %2 != 0){
    //             return false;
    //         }
    //     }
    // return true;
      int[] freq = new int[501];
        for(int num : nums){
            freq[num] = freq[num] + 1;
        }
        for(int f : freq){
            if(f % 2 != 0) return false;
        }
        return true;
    }
}