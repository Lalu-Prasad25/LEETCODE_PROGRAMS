class Solution {
    public int findSpecialInteger(int[] arr) {
        int rep = arr.length/4;
        for(int i = 0; i< arr.length-rep; i++){
            if(arr[i] == arr[i+rep]){
                return arr[i];
            }
        }
        return -1;
    }
}