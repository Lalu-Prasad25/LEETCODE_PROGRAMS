class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n[] = new int[101];
        for(int i : nums){
            n[i]++;
        }
        int goodPairs = 0;
        for(int i = 0 ;i<= 100 ;i++){
            if(n[i] > 1 ){
                goodPairs += (n[i] * (n[i] - 1)) / 2;
        }
        }
        return goodPairs;

    }
}