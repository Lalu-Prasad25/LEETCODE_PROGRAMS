class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap();
        for(int i : nums){
            int count = h.getOrDefault(i,0);
            count++;
            h.put(i,count);
        }
      int freq[]= new int[k];
      
         List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(h.entrySet());
        Collections.sort(list, (a, b) -> {
            return b.getValue() - a.getValue();
        });
    for(int i = 0 ; i<= k-1;i++){
    freq[i] = list.get(i).getKey();
    }

    return freq;

    }
}