class Solution {
    public String finalString(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<=c.length-1;i++){
            if(c[i] != 'i'){
                sb.append(c[i]);
            }else{
                sb.reverse();
            }
        }
        return   sb.toString();   
    }
}