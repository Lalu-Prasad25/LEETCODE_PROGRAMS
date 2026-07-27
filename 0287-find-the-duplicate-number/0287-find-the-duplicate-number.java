class Solution {
    public int findDuplicate(int[] nums) {
   HashSet<Integer> s= new HashSet<>();
   for(Integer i : nums){
    if(!(s.contains(i))){
        s.add(i);
    }else{
        return i;
    }
   }
   return 0;
}
}
    
