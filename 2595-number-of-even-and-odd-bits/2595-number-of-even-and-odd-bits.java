class Solution {
    public int[] evenOddBit(int n) {
        int binary[] = new int[10];
        int index = 0;
        int even = 0 ,odd =0;
        while(n!=0){
            binary[index] = n%2;
            n = n/2;
            index++;
        }
        for(int i = 0 ;i<= binary.length-1;i++){
            
            if(binary[i]==1){
                if(i%2 ==0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        return new int[]{even,odd};
    }
}