class Solution {
    public int fib(int n) {
      if(n==0){
        return n;
      }
        int i = 0 ,j= 1;
        int sum =0;
        n = n-1;
        while(n!=0){
            sum = i+j;
            i =j;
            j= sum;
            n--;
        }
        return  j;
    }
}