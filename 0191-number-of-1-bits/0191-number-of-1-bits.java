class Solution {
    public int hammingWeight(int n) {
        StringBuilder binary = new StringBuilder();

            while (n > 0) {
            int rem = n % 2;
            binary.append(rem);
            n = n / 2;
            }
            int sum =0;
            char c []= String.valueOf(binary).toCharArray();
            for(int i =0 ;i<=c.length-1;i++){
                sum = sum+ (int) (c[i]-'0');
            } 

            return sum;
    }
}