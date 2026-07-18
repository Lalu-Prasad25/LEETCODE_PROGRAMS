class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output ="";
        int i = 0 , j = 0 ;
        boolean decVar = true;
        while( i < word1.length() && j < word2.length()){
            if(decVar){
                output += word1.charAt(i);
                i += 1;
                decVar = false;
            }else{
                output += word2.charAt(j);
                j += 1;
                decVar = true;
            }
        }

        while(i < word1.length()){
            output+= word1.charAt(i);
            i += 1;
        }
           while(j < word2.length()){
            output+= word2.charAt(j);
            j += 1;
        }

        return output;

    }
}