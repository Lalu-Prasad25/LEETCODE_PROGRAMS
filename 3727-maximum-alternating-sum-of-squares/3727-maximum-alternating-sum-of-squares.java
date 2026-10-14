class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum[] = new long[nums.length];
        for(int i=0;i<=nums.length-1;i++){
            sum[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(sum);
        int i=0,j=nums.length-1;
        long ans=0;
        boolean cond = true;
        while(i<=j){
            if(cond){
            ans += sum[j];
            j--;
            cond = false;
            }else{
            ans -= sum[i];
            i++;
            cond = true;
        }
        }

        return ans;
    }
}