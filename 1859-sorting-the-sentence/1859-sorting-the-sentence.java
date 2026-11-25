class Solution {
    public String sortSentence(String s) {
        String []words = s.split(" ");
        String []ans = new String[words.length];
        for(int i = 0 ; i<= words.length-1;i++){
            String res = words[i].substring(0,words[i].length()-1);
            int index =words[i].charAt(words[i].length()-1)- '0';
            ans[index-1] = res;
        }

        return String.join(" ",ans);
    }
}