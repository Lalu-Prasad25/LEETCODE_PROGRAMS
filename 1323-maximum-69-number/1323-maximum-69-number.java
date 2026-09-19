class Solution {
    public int maximum69Number (int num) {
        char[] c = String.valueOf(num).toCharArray();
        int max = num;
        for(int i = 0; i < c.length; i++) {
            if(c[i] == '6') {
                c[i] = '9';
                int newNum = Integer.parseInt(new String(c));
                if(newNum > max) {
                    max = newNum;
                }
                c[i] = '6';
            }
        }
        return max;
    }
}