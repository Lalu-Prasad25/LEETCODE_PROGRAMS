class Solution {
    public int reverse(int x) {
      
        int temp = x;
        if(x < 0){
            x = -(x);
        }
long rev =0;
        while(x >0){
            int rem = x%10;
            rev =(rev*10)+rem;
            x = x/10; 
        }
        if(temp < 0){
            rev = -rev;
        }
         if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)rev;
    }
}