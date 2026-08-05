class Solution {
    public boolean isHappy(int n) {
        int rem,sum;
        if( n ==1 || n==7){
            return true;
        }
        else if(n< 10) {return false;}
        else{
            sum=0;
            while(n >0){
                 rem = n%10;
                sum += (rem*rem);
                n= n/10;
            }
        }
        return isHappy(sum);
        // HashSet<Long> h = new HashSet();
        // long sum = 0;
        // while(n != 1){
        //     sum =0;
        // while(n != 0){
        //     int rem = n%10;
        //     n =n/10;
        //     sum =sum+ (rem*rem);
        // }
        //     if(h.contains(sum)){
        //         return false;
        //     }
        //         h.add(sum);  
                                   
        //  n = (int)sum; 
        // }
        // return true;  
    }
}