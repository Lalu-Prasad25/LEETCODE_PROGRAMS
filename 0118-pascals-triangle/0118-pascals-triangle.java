
class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i <= numRows; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for(int j = 0; j < i; j++) {
                a.add(nCr(i - 1, j));
            }
            list.add(a);
        }
        return list;
    }
    public static int nCr(int row, int col) {
        int res = 1;
        for(int i = 0; i < col; i++) {
            res = res * (row - i);
            res = res / (i + 1);
        }
        return res;
    }
}
