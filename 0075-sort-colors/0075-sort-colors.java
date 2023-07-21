class Solution {
    public void sortColors(int[] nums) {
        int a;
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i; i1 < nums.length; i1++) {
                if (nums[i]>nums[i1]){
                    a=nums[i1];
                    nums[i1] = nums[i];
                    nums[i] = a;
                }
            }
        }
    }
}