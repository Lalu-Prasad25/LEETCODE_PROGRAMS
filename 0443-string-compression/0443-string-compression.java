class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while(i < chars.length) {
            char current = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == current) {
                count++;
                i++;
            }
            chars[index] = current;
            index++;
            if(count > 1) {
                String s = String.valueOf(count);
                for(int j = 0; j < s.length(); j++) {
                    chars[index] = s.charAt(j);
                    index++;
                }
            }
        }
        return index;
    }
}