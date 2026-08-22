class Solution {
    public int lengthOfLastWord(String s) {
    String[] c = s.trim().split("\\s+");
    
    return c[c.length-1].length();
}
}