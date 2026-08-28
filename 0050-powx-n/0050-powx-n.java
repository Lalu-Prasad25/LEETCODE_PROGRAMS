class Solution {
    public double myPow(double x, int n) {
        long power = n;
        if(power < 0) {
            x = 1 / x;
            power = -power;
        }
        double output = 1;
        while(power > 0) {
            if(power % 2 == 1) {
                output = output * x;
            }
            x = x * x;
            power = power / 2;
        }
        return output;
    }
}