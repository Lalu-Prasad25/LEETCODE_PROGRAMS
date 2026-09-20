class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> a = new ArrayList();
        int l = -1, h = -1;
        boolean started = false;
        for(int i = 0; i <= nums.length - 2; i++) {
            if(nums[i] + 1 == nums[i + 1]) {
                if(!started) {
                    l = nums[i];
                    started = true;
                }
                h = nums[i + 1];
            } else {
                if(!started) {
                    a.add(String.valueOf(nums[i]));
                }else if(l == h) {
                    a.add(String.valueOf(l));
                }else {
                    a.add(l + "->" + h);
                }
                l = -1;
                h = -1;
                started = false;
            }
        }
        if(nums.length > 0) {
            if(!started) {
                a.add(String.valueOf(nums[nums.length - 1]));
            }else if(l == h) {
                a.add(String.valueOf(l));
            }else {
                a.add(l + "->" + h);
            }
        }
        return a;
    }
}