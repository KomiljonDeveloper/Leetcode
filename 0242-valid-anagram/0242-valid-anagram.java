class Solution {
    public boolean isAnagram(String s, String t) {
              if (t.length() != s.length()) return false;

         char[] char_counts = new char[26];
         for (int i = 0; i < s.length(); i++) {
             char_counts[s.charAt(i) - 'a']++;
             char_counts[t.charAt(i) - 'a']--;
         }

         for (char charCount : char_counts) {
             if (charCount != 0) {
                 return false;
             }

         }
return true;
    }
}