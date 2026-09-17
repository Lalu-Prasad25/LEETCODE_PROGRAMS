class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int a = cost[0];
        int b = cost[1];
        int i = 2;
        while(i < n) {
            int current = cost[i] + Math.min(a, b);
            a = b;
            b = current;
            i++;
        }
        return Math.min(a, b);
    }
}