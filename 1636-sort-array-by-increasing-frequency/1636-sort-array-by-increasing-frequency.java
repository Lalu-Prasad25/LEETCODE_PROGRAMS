class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i : nums) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> a = new ArrayList<>(h.keySet());

        Collections.sort(a, (x, y) -> {
            if(h.get(x) != h.get(y)) {
                return h.get(x) - h.get(y);
            }
            return y - x;
        });

        int index = 0;

        for(int i : a) {
            for(int j = 0; j < h.get(i); j++) {
                nums[index] = i;
                index++;
            }
        }

        return nums;
    }
}