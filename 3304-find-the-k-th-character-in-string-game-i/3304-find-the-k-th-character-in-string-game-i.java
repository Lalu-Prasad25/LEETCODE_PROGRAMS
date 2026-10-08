class Solution {
    public char kthCharacter(int k) {
        StringBuilder s = new StringBuilder();
        s.append("a");
        while(s.length() < k) {
            int n = s.length();
            for(int i = 0; i < n; i++) {
                s.append((char)(s.charAt(i) + 1));
            }
        }
        return s.charAt(k - 1);
    }
}