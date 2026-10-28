class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       ArrayList<Character> a = new ArrayList();
       for(int i = 0 ;i<= jewels.length()-1;i++){
            a.add(jewels.charAt(i));
       }

       int count  = 0 ;
       for(int i = 0 ;i<= stones.length()-1;i++){
        if(a.contains(stones.charAt(i))){
            count++;
        }
       }
        return count;   
    }
}