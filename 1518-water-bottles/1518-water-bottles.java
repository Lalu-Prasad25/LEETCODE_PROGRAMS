class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int remaining = numBottles % numExchange;
            count += newBottles;
            numBottles = newBottles + remaining;
        }
        return count;
    }
}
