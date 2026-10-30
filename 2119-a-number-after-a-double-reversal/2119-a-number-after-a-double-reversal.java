class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev = reverse(num);
        rev = reverse(rev);
        return rev == num;
    }

    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            int rem = n% 10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        return rev;
    }
}