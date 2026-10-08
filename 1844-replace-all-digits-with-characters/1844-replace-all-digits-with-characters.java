class Solution {
    public String replaceDigits(String s) {
        StringBuilder str = new StringBuilder();
        for(int i= 0;i<= s.length()-1;i++){
            if(s.charAt(i) >= 48 && s.charAt(i) <=57){
                str.append((char)(s.charAt(i-1)+ (s.charAt(i)-'0')));
            }else{
                str.append(s.charAt(i));
            }
        }
        return String.valueOf(str);
    }
}