class Solution {
    public int minMoves(int target, int maxDoubles) {
        int count =0 ;
           while( target > 1){
            if(target % 2==0 && maxDoubles != 0){
                target = target /2;
                maxDoubles--;
                count++;
            }else if(maxDoubles == 0){
                count = count + (target - 1);
                target = 1;
            }else{
                count++;
                target = target -1;
            }
        }
        return count;
    }
}