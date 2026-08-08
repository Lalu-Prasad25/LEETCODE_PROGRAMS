class Solution {
    public int countEven(int num) {
        int i =1;
        int sum;
        int count=0 ;
        while( i<= num ){
            int n =i;
            sum =0;
            while(n!=0){
            int rem =n%10;
            sum =sum+ rem;
            n=n/10;
        }
        if(sum%2 == 0){
            count++;
        }
        i++;
        }
    return count;}
}