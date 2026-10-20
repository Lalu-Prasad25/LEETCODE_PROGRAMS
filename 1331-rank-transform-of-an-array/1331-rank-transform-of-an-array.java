
import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> h = new HashMap<>();

        int rank = 1;

        for(int i = 0; i < sorted.length; i++) {
            if(!h.containsKey(sorted[i])) {
                h.put(sorted[i], rank);
                rank++;
            }
        }

        int[] ans = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            ans[i] = h.get(arr[i]);
        }

        return ans;
    }
}
