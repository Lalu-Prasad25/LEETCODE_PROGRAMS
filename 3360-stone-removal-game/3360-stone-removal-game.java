class Solution {
    public boolean canAliceWin(int n) {
        boolean flag =true;
        int i=0;
        while( true){
            int remove = 10 - i;

            if (n < remove) {
                return !flag;
            }
            n = n - remove;

            flag = !flag;
            i++;
        }
    }
}