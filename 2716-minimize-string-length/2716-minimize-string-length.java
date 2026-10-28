class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> h = new HashSet();
        for(int i= 0;i<= s.length()-1;i++){
            h.add(s.charAt(i));
        }
       
        return h.size();
        // return (int)s.chars().distinct().count();
    }
}