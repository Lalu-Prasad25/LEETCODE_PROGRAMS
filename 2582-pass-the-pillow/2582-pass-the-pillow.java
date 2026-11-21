class Solution {
    public int passThePillow(int n, int time) {
        // int i = 1;
        // boolean flag = true;

        // while (true) {
        //     if (time == 0) {
        //         return i;
        //     }
        //     if (flag) {
        //         i++;
        //         if (i == n) {
        //             flag = false;
        //         }
        //     } else {
        //         i--;
        //         if (i == 1) {
        //             flag = true;
        //         }
        //     }
        //     time--;
        // }


        int cycle = 2 * (n - 1);
        int pos = time % cycle;

        if (pos < n) {
            return pos + 1;
        } else {
            return n - (pos - (n - 1));
    }
    }
}
