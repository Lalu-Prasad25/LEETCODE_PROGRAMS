class Solution {
    public String reverseByType(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        while (i < j) {
            if (c[i] < 97 || c[i] > 122) {
                i++;
            } else if (c[j] < 97 || c[j] > 122) {
                j--;
            } else {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;

                i++;
                j--;
            }
        }
        i = 0;
        j = c.length - 1;
        while (i < j) {
            if (c[i] >= 97 && c[i] <= 122) {
                i++;
            } else if (c[j] >= 97 && c[j] <= 122) {
                j--;
            } else {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(c);
    }
}