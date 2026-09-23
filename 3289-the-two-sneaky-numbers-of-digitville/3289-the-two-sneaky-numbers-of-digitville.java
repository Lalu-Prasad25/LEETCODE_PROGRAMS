class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap();
        int []ans = new int[2];
        for(Integer i :nums){
            int count = h.getOrDefault(i,0);
            count++;
            h.put(i,count);
        }       
        int index =0;
        for(Integer i:h.keySet()){
            if(h.get(i)>1){
                ans[index]=i;
                index++;
            }
        }
        return ans;
            }
}