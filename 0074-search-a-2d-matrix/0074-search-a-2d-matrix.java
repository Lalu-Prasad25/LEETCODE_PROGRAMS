class Solution {
    public boolean searchMatrix(int[][] g, int t) {
        int m  = g.length , n= g[0].length;
       int i = 0, j = m*n-1; 
       int mid;
       while(i<= j){
            mid = i+(j-i)/2;
            int row = mid /n ;
            int column = mid %n;
            if(t == g[row][column] ){
                return true;
            }else if(t < g[row][column]){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
       }
       return false ;
    }
}