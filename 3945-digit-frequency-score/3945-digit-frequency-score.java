class Solution {
    public int digitFrequencyScore(int n) {
        // HashMap<Integer,Integer> h = new HashMap();
        // while(n!=0){
        //     int rem= n%10;
        //     int count = h.getOrDefault(rem ,0);
        //     count++;
        //     h.put(rem, count);
        //     n = n/10;
        // }

        // int sum= 0;
        // for(Integer i: h.keySet()){
        //     sum= sum+ (h.get(i)*i);
        // }
        int sum=0;
        while(n !=0){
            sum = sum+ (n%10);
            n=n/10;
        }
        return sum;
    }
}