class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> h = new HashSet<>();
        char[] c = s.toCharArray();
        h.add('a');
        h.add('e');
        h.add('i');
        h.add('o');
        h.add('u');
        h.add('A');
        h.add('E');
        h.add('I');
        h.add('O');
        h.add('U');
        int i= 0 , j= s.length()-1;
        while(i <j){
                if(!(h.contains(c[j]))){
                    j--;
                }else{
                       if( !(h.contains(c[i]) ) ){
                       i++;
                }else{
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp; 
                      i++;
                j--;
                }
              
        }
    }
    return new String(c);
    }
}