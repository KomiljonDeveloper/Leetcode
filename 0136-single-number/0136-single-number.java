class Solution {
    public int singleNumber(int[] nums) {
        int y = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    y++;
                }
            }
            if (y == 1) {
                return nums[i];
            } y=0;
            
        }return 0;
    }
}