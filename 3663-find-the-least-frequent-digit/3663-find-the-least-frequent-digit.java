class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer> h =  new HashMap();
        while(n!=0){
            int rem = n%10;
            int count = h.getOrDefault(rem ,0)+1;
            h.put(rem, count);
            n=n/10;
        }
        int least = Integer.MAX_VALUE;
        int ans =0;
        for(Integer i: h.keySet()){
            if(least != h.get(i)){
            if(h.get(i) < least){
                least = h.get(i);
                ans = i;
            }
            }{
                ans = Math.min(ans, i);
            }
        }
        return ans;
    }
}