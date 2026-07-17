class Solution {
    public int diagonalPrime(int[][] nums) {
        int i , j  , prime=0 , n = nums.length;

        for(i =0 ; i< n ; i++ ){
            for(j = 0 ;j < nums[i].length ; j++){
                if(i==j || i+j == n-1){
                    if ( nums[i][j] > prime&& checkPrime(nums[i][j]) ) {
                prime = nums[i][j];
            }

                }
            }
        }
        return prime;
    }

    public boolean checkPrime(int n){
        int count = 0 ;
     for(int i =1; i*i <= n ; i++){
        if(n % i == 0 ){
            count++;
            if( i != (n/i)){
                count++;
            }
        }
     }
     return count==2;
    }
}