class Solution {
        public int[] searchRange(int[] nums, int target) {
         int []num1 = {-1,-1};
        int y=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                y++;
            }
        }
        if (y==0){
            return num1;
        }
        int []num2 = new int[y];
        y=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                num2[y++] = i;
            }
        }
        num1[0] = num2[0];
        num1[1] = num2[y-1];
          return num1;

        }
}