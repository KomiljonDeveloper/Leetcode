class Solution {
    public int divide(int dividend, int divisor) {
         long ok = (long) (dividend)/(long)(divisor);
        if (ok>(long) Math.pow(2,31)-1){
            return (int) (ok-1);
        }

        return (int) ok;
    }
}