class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> a = new ArrayList();
        int i = nums[0];
        int j = nums[nums.length-1];
        int index = 0;
        while(i <= j){
           if(index < nums.length && nums[index] == i) {
                index++;
            } else {
                a.add(i);
            }
            i++;
        }
        return a;
    }
}