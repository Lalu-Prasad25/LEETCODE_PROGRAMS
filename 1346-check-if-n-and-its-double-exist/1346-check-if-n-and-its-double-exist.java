class Solution {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> a = new ArrayList();
        for(int i : arr){
            a.add(i);
        }
        for(int i =0;i<= arr.length-1;i++){
            if(a.contains(arr[i]/2) && arr[i]%2==0 && a.indexOf(arr[i]/2) != i) {
                return true;
            }
        }
        return false;
    }
}