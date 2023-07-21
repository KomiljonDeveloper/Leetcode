class Solution {
    public int lengthOfLastWord(String s) {
           char n=' '; int a=0;
        String d=s.toLowerCase()+n;
        for (int i = 0; i < d.length()-1; i++) {
            if (n!=d.charAt(i)){
            a++;
            }else {
                if (d.charAt(i+1)>(char)96 && d.charAt(i+1)<(char)123){
                    a=0;
                }
            }
        }return a;
        
    }
}