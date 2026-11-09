class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // HashSet<Integer> h =  new HashSet();
        // for(int i : banned){
        //     if(i <= n){
        //         h.add(i);
        //     }
        // }
        // int sum =0;
        // int i =1;
        // int count = 0;
        // while(i <= n){
        //     if (!h.contains(i)) {
        //         if (sum + i > maxSum) {
        //             return count;
        //         }
        //         count++;
        //         sum = sum + i;
        //     }
        //     i++;
        // }
        // return count;
        boolean []set=new boolean[10001];
        for(int i : banned)set[i]=true;
        int sum=0;
        int count=0;
        for(int i=1;i<=n;i++){
            if(set[i])continue;
            sum+=i;
            if(sum>maxSum)break;
            count++;
        }
        return count;
    }
}
