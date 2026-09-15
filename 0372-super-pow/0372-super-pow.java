class Solution {
    public int superPow(int a, int[] b) {
        if(a ==1){
            return a;
        }
        long result = 1;
        a = a % 1337;
        for(int i = 0; i < b.length; i++) {
            result = power(result, 10);
            result = (result * power(a, b[i])) % 1337;
        }
        return (int)result;
    }
    public long power(long a, int b) {
        long result = 1;
        for(int i = 0; i < b; i++) {
            result = (result * a) % 1337;
        }
        return result;
    }
}