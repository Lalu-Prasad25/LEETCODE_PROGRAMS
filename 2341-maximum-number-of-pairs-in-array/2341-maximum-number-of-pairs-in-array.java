
class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count = 0;
        int operation = 0;
        HashMap<Integer, Integer> h = new HashMap();
        for(int i : nums) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }
        for(int i : h.keySet()) {
            operation += h.get(i) / 2;
            count += h.get(i) % 2;
        }
        return new int[]{operation, count};
    }
}
