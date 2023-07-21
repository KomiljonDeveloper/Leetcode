class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int j=0;
        int arry[] = new int[set.size()];
        for (Integer integer : set) {
            arry[j++] = integer;
        }
        Arrays.sort(arry);
        
        if (arry.length<3)
            return arry[arry.length-1];
        return arry[arry.length-3];
}}