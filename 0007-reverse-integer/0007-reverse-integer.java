class Solution {
    public int reverse(int x) {
       int a=0;
        long d=0;
        boolean ab = false;
        if(x<0){
            ab = true;
            x*=-1;
        }
        while(x>0){
            a=x%10;
            d=d*10+a;
            x/=10;
        }
        if(ab){
            d*=-1;
        }
        //-231 <= x <= 231 -1
        if (d>=-Math.pow(2,31) && d<=(Math.pow(2,31)-1)){
            return (int) d;
        }
        return 0;
    }
}