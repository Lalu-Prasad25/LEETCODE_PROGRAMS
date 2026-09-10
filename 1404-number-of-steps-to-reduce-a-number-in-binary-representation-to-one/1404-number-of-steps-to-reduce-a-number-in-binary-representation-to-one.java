class Solution {
    public int numSteps(String s) {
        int count =0;
      StringBuilder str =  new StringBuilder(s);
      while(!str.toString().equals("1")){
        if(str.charAt(str.length() - 1) == '0'){
        str.deleteCharAt(str.length() - 1);
            count++;
        }else{
             int i = str.length() - 1;
                while (i >= 0 && str.charAt(i) == '1') {
                    str.setCharAt(i, '0');
                    i--;
                }
                if (i >= 0) {
                    str.setCharAt(i, '1');
                } else {
                    str.insert(0, '1');
            }
            count++;
      }
      }
      return count;

    }
}