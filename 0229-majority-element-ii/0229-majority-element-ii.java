class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h =new HashMap();
        ArrayList<Integer> s = new ArrayList();
        for(int i: nums){
            int count = h.getOrDefault(i ,0);
            count++;
            h.put(i ,count);
        }

        for(Integer i: h.keySet()){
            if(h.get(i) > (nums.length/3)){
                s.add(i);
            }
        }
return s;
    }
}