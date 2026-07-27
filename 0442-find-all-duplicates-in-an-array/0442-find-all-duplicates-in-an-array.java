class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        HashSet<Integer> s = new HashSet<>();
        HashSet<Integer> s1 = new HashSet<>();
        for(Integer i:nums){
            if(s.contains(i)){
                if((!s1.contains(i))){
                    s1.add(i);
                }
            }else{
                s.add(i);
            }
        }
        return new ArrayList<Integer>(s1);
    }
    }
        
    
