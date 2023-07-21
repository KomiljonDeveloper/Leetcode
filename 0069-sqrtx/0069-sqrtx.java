class Solution {
    public int mySqrt(int x) {
    long a=0;
        long b=x;
        while(a+1<b){
            long c=a+(b-a)/2;
            if(c*c==x){
                return (int)c;
                }else if(c*c<x){
                a=c;
            
            }else{
                b=c;
            }
        }if(b*b==x){
            return (int)b;
        }
        return (int)a;
    }
}