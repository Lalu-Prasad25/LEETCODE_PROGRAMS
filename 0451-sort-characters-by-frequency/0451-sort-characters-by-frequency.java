class Solution {
    public String frequencySort(String s) {
    HashMap<Character,Integer> h = new HashMap();
    for(int i = 0 ; i<= s.length()-1;i++){
        int count = h.getOrDefault(s.charAt(i),0);
        count++;
        h.put(s.charAt(i),count);
    }
     ArrayList<Character> list = new ArrayList<>(h.keySet());
        Collections.sort(list, (a, b) -> {
            return h.get(b) - h.get(a);
        });
        StringBuilder ans = new StringBuilder();
        for(char c : list) {
            for(int i = 0; i < h.get(c); i++) {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}