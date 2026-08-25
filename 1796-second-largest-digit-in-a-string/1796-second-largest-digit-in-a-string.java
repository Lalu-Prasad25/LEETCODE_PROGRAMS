class Solution {
    public int secondHighest(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<= s.length()-1;i++){
            if(s.charAt(i) >= 48 && s.charAt(i) <=57 ){
                str.append(s.charAt(i));
            }
        }
        if(str.length() == 0){
            return -1;
        }
        char c[] = str.toString().toCharArray();
        Arrays.sort(c);
          int highest = c[c.length - 1];

        for (int i = c.length - 2; i >= 0; i--) {
            if (c[i] != highest) {
                return c[i] - '0';
            }
        }
        return -1; 
        
    }
}