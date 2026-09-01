class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> a = new ArrayList<>();
        for (int i : nums1) {
            a.add(i);
        }
        for (int i : nums2) {
            a.add(i);
        }
        Collections.sort(a);
        int n = a.size();
        if (n % 2 != 0) {
            return a.get(n / 2);
        }
        int first = a.get(n / 2 - 1);
        int second = a.get(n / 2);
        return (first + second) / 2.0;
    }
}