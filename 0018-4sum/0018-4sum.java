class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> s =new HashSet();
        int i=0 , j , k , l;
        while( i<=nums.length-1){
            j =i+1;
            while(j<= nums.length-1){
                k =j+1;
                l =nums.length-1;
                while(k<l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum== target){
                        List<Integer> a= new ArrayList();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        a.add(nums[l]);
                        s.add(a);
                        k++;
                        l--;
                    }else if(sum > target){
                        l--;
                    }else{
                        k++;
                    }
                }
            j++;

            }
            i++;
        }
        return new ArrayList(s);
    }
}