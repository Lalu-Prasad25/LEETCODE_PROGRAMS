class Solution {
    public int commonFactors(int a, int b) {
        int lower = b;
        int count=0;
        if(a < b) {
			lower = a;
		}
		for(int i =1;i<=lower ;i++) {
			if((a % i == 0 )&&( b %i== 0)){
				count++;
			}
		}
		return count;
    }
}