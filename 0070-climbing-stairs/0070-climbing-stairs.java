class Solution {
    public int climbStairs(int n) {
        int i = 0 , j= 1 ;
        if(n == 1 || n==2 || n == 3 ){
            return n; 
        }
        int sum =0;
        while(n!=0){
            sum= i+j;
            i = j;
            j = sum;
            n--;
        }
        return j;
    }
}