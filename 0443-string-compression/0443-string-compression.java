class Solution {
    public int compress(char[] chars) {
       StringBuilder s = new StringBuilder();
       char c = chars[0];
       int count =1;
       for(int i=1;i<=chars.length-1;i++){
        if(c == chars[i]){
            count++;
        }else if(c != chars[i]){
            s.append(c);
            if(count >1){
            s.append(Integer.toString(count));
            }
            count =1;
            c= chars[i];
        }
       }
       s.append(c);
        if(count >1){
            s.append(Integer.toString(count));
            }
        for(int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
       return s.length();
    }
}