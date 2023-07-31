class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        
        String[] split1 = s.split(" ");
        if(pattern.length()!=split1.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i)) ){
                if (!map.get(pattern.charAt(i)).equals(split1[i])){
                    return false;
                }
            }else {
                if (map.containsValue(split1[i])){
                    return false;
                }
                map.put(pattern.charAt(i),split1[i]);
          }
        }
             return true;
}}