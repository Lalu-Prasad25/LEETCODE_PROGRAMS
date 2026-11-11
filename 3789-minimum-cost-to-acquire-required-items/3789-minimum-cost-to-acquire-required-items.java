class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long strategy1 = (long) need1 * cost1 + (long) need2 * cost2;
       
        int minNeed = Math.min(need1, need2); 
        long strategy2 = (long) minNeed * costBoth + (long) (need1 - minNeed) * cost1 + (long) (need2 - minNeed) * cost2;

        int maxNeed = Math.max(need1, need2);
        long strategy3 = (long) maxNeed * costBoth;

        return Math.min(strategy1,Math.min(strategy2, strategy3));
    }
}