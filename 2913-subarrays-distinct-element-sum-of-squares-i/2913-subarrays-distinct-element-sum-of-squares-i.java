class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<=nums.size()-1;i++){
            HashSet<Integer> h = new HashSet();
        for(int j=i;j<=nums.size()-1;j++){
            h.add(nums.get(j));
            sum += h.size()*h.size();
            }
        }
        return sum;
    }
}