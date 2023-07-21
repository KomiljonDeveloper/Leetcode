class Solution {
    public int missingNumber(int[] nums) {
  int s=nums[0],l=0,p=0;
        if (nums.length>2) {
            for (int i = 0; i < nums.length; i++) {
                if (s < nums[i]) {
                    s = nums[i];
                }
            }
            for (int j = 0; j <= s; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (j == nums[k]) {
                        l++;
                    }else {
                       p++;
                    }

                }
                if (p==s*(s-1)){
                    return s+1;
                }
               else if (l == 0) {
                    return j;
                }
                l = 0;
            }

        }else if (nums.length==1){
            if (nums[0]==0){
                return 1;
            }else {
                return 0;
            }
            
        }else {
            int y=0,m=0,w=0;
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (i==nums[j]) {
                    y++;
                        break;
                    }
                }if (y==0){
                    return i;
                }y=0;
            }

        }return 0;
    }
}