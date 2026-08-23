class Solution {
    public boolean wordPattern(String pattern, String s) {
    
     HashMap<Character,String> h = new HashMap();
     char []c = pattern.toCharArray();
     String[] str = s.trim().split("\\s+");
     if(c.length != str.length){
        return false;
     }
     for(int i=0 ;i<= c.length-1;i++){
        if (h.containsKey(c[i])) {
                if (!h.get(c[i]).equals(str[i])) {
                    return false;
                }
            } else {
                if (h.containsValue(str[i])) {
                    return false;
                }
                }

                h.put(c[i], str[i]);
     }
        return true;
    }
}