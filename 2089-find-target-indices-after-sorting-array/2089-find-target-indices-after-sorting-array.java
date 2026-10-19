class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> a = new ArrayList();
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==target){
                a.add(i);
            }
        }
        return a;
    }
}