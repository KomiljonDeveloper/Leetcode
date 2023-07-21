class Solution {
    public String longestCommonPrefix(String[] strs) {
        int k=strs[0].length(),t=0 ,l=0;
        String rek="";
        if(strs.length!=1){
        for (int i = 1; i < strs.length; i++) {
            if (k>strs[i].length()){
                k=strs[i].length();
                t=i;
            }
        }
        }else{
            t=0;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[t].charAt(i)==strs[j].charAt(i)){
                    l++;
                }}
                if (l==strs.length){
                    rek=strs[t].substring(0,i+1);
                }else {
                    break;
                }
             l=0;

        }return rek;
        
    }
}