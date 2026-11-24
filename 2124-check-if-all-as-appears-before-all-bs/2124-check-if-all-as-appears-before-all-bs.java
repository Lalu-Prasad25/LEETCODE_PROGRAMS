class Solution {
    public boolean checkString(String s) {
        char c[] = s.toCharArray();
    
        for(int i = 1 ;i<= c.length-1;i++){
            if(c[i] == 'a' && c[i-1] == 'b'){
                return false;
            }
        }
        return true;
}
}