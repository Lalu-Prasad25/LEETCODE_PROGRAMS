class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList();
        int dummy [] = new int[nums.length];
        for(int i =0;i<=nums.length-1;i++){
            dummy[nums[i]-1] = nums[i];
        }
          for(int i =0;i<=nums.length-1;i++){
                if(dummy[i]==0){
                    list.add(i+1);
                }

          }
          return list;

    }
    }
