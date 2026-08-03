class Solution {
    public int maxProfit(int[] p) {
        int[] m =new int[p.length];
        m[0] = p[0]; 
        int maxx =0;
int i;
        for(i =1 ;i<=p.length-1 ;i++){
            m[i] = Math.min(m[i-1],p[i]);
        }
         for(i =1 ;i<=p.length-1 ;i++){
            maxx = Math.max(maxx , (p[i] - m[i-1]) );
        }
        return maxx;
    }
}