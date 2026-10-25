
class Solution {
    public int convertTime(String current, String correct) {
        int h1 = Integer.parseInt(current.substring(0, 2));
        int m1 = Integer.parseInt(current.substring(3));
        int h2 = Integer.parseInt(correct.substring(0, 2));
        int m2 = Integer.parseInt(correct.substring(3));
        int diff = (h2 * 60 + m2) - (h1 * 60 + m1);
        int count = 0;
        count += diff / 60;
        diff %= 60;
        count += diff / 15;
        diff %= 15;
        count += diff / 5;
        diff %= 5;
        count += diff;
        return count;
    }
}
