class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
            HashMap<String,List<String>> h = new HashMap();
            String s;
            for(String i :strs){
                char[] a = i.toCharArray();
                Arrays.sort(a);
                s = String.valueOf(a);
                if(!h.containsKey(s)){
                    h.put(s,new ArrayList<String>());
                }
                h.get(s).add(i);
            }

            return new ArrayList(h.values());




    }
}