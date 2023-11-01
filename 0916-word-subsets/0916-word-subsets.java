class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        List<String> result = new ArrayList<>();

        int [] target = new int[26];

        for (String s : words2) {
            int temp[] = new int[26];
            for (char c : s.toCharArray()) {
                temp[c-'a']++;
                target[c-'a'] = Math.max(temp[c-'a'],target[c-'a']);
            }
        }
        for (String s : words1) {
            int [] arr = new int[26];
            for (int i : s.toCharArray()) arr[i-'a']++;

            if (subset(arr,target)){
                result.add(s);
            }

        }

        return result;

    }
    private static boolean subset(int[] arr, int[] target) {
        for (int i = 0; i < 26; i++) {
            if (target[i]>arr[i]) return false;
        }
        return true;
    }
    }
