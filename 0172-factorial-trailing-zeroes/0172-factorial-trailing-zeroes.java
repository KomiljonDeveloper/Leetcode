class Solution {
    public int trailingZeroes(int n) {
        int a = 0;
        boolean bool = true;
        int j = 1;
        while (bool) {
            if (n < (int) (Math.pow(5, j))) {
                bool = false;
                break;
            }
            a += n / (int) (Math.pow(5, j));
            j++;
        }
        return a;
    }
}