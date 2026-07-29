class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i:nums){
            if(s.contains(i)){
                    s1.add(i);
            }else{
                s.add(i);
            }
        }
        return s1;
    }
    }
    
