class Solution {
    public int[] twoSum(int[] a, int target) {
        // HashMap<Integer,Integer> h =new HashMap();

        // for(int i =0; i<numbers.length;i++){
        //     if(h.containsKey(target-numbers[i])){
        //         return new int[]{h.get(target-numbers[i]),i+1 };
        //     }else{
        //             h.put(numbers[i],i+1);
        //     }
        // }
        // return new int[]{};
        int[] ans =new int[2];
        int i = 0 ,j = a.length-1;
        while(i <j){
            if(a[i]+a[j] == target){
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }else if(a[i] + a[j] > target){
                j--;
            }else{
                i++;
            }
        }
            return ans;    
    }
}