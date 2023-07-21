class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[0].length; i1++) {
                if (target==matrix[i][i1]){
                    return true;
                }
                
            }
        }return false;

    }
}