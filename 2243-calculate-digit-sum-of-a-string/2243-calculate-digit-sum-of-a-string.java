class Solution {
    public String digitSum(String s, int k) {
        if (s.length() <= k) {
            return s;
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i += k) {
            int end = Math.min(i + k, s.length());
            String sub = s.substring(i, end);
            int ans = 0;
            for (int j = 0; j < sub.length(); j++) {
                ans += sub.charAt(j) - '0';
            }
            str.append(ans);
        }
        return digitSum(str.toString(), k);
    }
}