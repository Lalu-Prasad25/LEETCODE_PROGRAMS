class Solution {
    public boolean digitCount(String num) {
        char[] c = num.toCharArray();
        int freq[] = new int[10];
        for(char i : c) {
            int n = i - '0';
            freq[n]++;
        }
        for(int i = 0; i < c.length; i++) {
            if(freq[i] != c[i] - '0') {
                return false;
            }
        }
        return true;
    }
}