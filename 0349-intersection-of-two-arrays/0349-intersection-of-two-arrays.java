class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashSet<Integer> s1 =new HashSet();
      HashSet<Integer> s2 =new HashSet();
        for(Integer i : nums1){
               s1.add(i); 
        }
         for(Integer i : nums2){
            if(s1.contains(i)){
               s2.add(i);
        }}

        int []a =new int[s2.size()];
        int index =0;
        for(Integer i:s2){
            a[index] = i;
            index++;
        }

        return a;

    }
}