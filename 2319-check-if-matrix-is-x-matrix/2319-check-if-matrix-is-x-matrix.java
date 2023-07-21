class Solution {
    public boolean checkXMatrix(int[][] grid) {
          int k=0, l=0, o=0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (i==j || i+j== grid.length-1){
                    if (grid[i][j]==0){
                        k++;
                    }
                }else{
                    if (grid[i][j]!=0){
                        l++;
                    }
                }
            }
        }
        if (k==0 && l==0){
            return true;
        }else {
            return false;
        }
    }
}