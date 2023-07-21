class Solution {
    public int[] plusOne(int[] digits) {
   int y=0;
        if (digits[digits.length-1]!=9){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }else {
            for (int i = digits.length-1; i >=0 ; i--) {
                if (digits[i]==9){
                digits[i]=0;
                y++;
            }else {
                digits[i]=digits[i]+1;
                return digits;
                }
            }if (y==digits.length){
                int a[]=new int[y+1];
                for (int i = 1; i < y+1; i++) {
                    a[0]=1;
                    a[i]=0;
                }return a;
            }
        }return null;
    }
}