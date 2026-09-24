class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> a = new ArrayList();
        boolean sd =true;;
        for(int i = left ; i<= right;i++){
            sd = true;
            int num = i ;
            if(num%10 != 0){
                while(num!=0){
                    int rem = num%10;
                    if(rem ==0|| i%rem !=0){
                        sd= false;
                        break;
                        }
                    num = num/10;
                }
                if(sd){
                    a.add(i);
                }
            }
        }
        return a;
    }
}