class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String ,Integer> h= new HashMap();
        for(String i : words){
            int count = h.getOrDefault(i ,0);
            count++;
            h.put(i,count);
        }

        List<Map.Entry<String,Integer>> list =  new ArrayList<>(h.entrySet());
       Collections.sort(list, (a, b) -> {
            if(a.getValue() != b.getValue()) {
                return b.getValue() - a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });
       ArrayList<String> ans = new ArrayList();
     
        for(Map.Entry<String, Integer> s : list) {
            if(k == 0) {
                break;
            }
            ans.add(s.getKey());
            k--;
        }
        return ans;
    }
}