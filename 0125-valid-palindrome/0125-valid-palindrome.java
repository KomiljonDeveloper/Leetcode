class Solution {
    public boolean isPalindrome(String s) {
 String a=s.toLowerCase();String l="";
        int y=0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)>(char)96 && a.charAt(i)<(char)123 ){
                String d=String.valueOf(a.charAt(i));
                l =l+d;
            }else if(a.charAt(i)>=(char) 48 && a.charAt(i)<=(char) 57){
                String d=String.valueOf(a.charAt(i));
                l=l+d;
            }
        }
        if (l.length()%2==0){
        for (int i = 0; i < l.length()/2; i++) {
            if (l.charAt(i)!=l.charAt(l.length()-1-i)){
                y++;

            }
        }if (y==0){
            return true;
        }else {
            return false;
        }}else {
            for (int i = 0; i < (l.length()-1)/2; i++) {
                if (l.charAt(i)!=l.charAt(l.length()-1-i)){
                    y++;
                }
            }if (y==0){
                return true;
            }else {
                return false;
            }
            }
    }
}