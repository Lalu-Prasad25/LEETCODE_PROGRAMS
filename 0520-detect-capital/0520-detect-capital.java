class Solution {
    public boolean detectCapitalUse(String word) {
        int cap = 0, small = 0 , first =0;
        for(int i=0 ;i<= word.length()-1;i++){
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90){
                cap++;
            }else if(word.charAt(i)>= 97 && word.charAt(i) <=122){
                small++;
            }

        }
        if(cap == word.length()){
            return true;
        }else if(small == word.length()){
          return   true;
        }else if(word.charAt(0) >= 65 && word.charAt(0) <= 90 && cap ==1){
            return true;
        }
        return false;
}}