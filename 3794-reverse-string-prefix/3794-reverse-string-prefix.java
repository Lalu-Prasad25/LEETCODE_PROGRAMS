class Solution {
    public String reversePrefix(String s, int k) {
          char[] c = s.toCharArray();
        int i=0, j=k-1;
            while(i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(c);
    }
}