class Solution {
    public int searchInsert(int[] nums, int target) {
                
   int y=0;boolean bool=true;
        for (int i = 0; i < nums.length; i++) {
            if (target==nums[i]){
                bool=false;
                return i;
            }
        }if (bool){
            for (int i = 0; i < nums.length; i++) {
                if(target<nums[nums.length-1] ){
                    if(target>nums[0]){
                if (target>nums[i] && target<nums[i+1]){
                    return i+1;
                }
            }else{
                        return 0;
                    } }else{
                    return nums.length;
                }
        }}
    return  0;
    }
}