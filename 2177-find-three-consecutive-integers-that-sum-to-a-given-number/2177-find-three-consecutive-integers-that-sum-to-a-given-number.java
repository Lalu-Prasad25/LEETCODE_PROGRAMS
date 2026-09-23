class Solution {
    public long[] sumOfThree(long num) {
        if(num % 3 != 0){
            return new long[]{};
        }
        long ans[] = new long[3];
        long start  = num /3 ;
        ans[0] = start -1;
        ans[1]= start;
        ans[2] = start+1;

      return ans;
    }
}