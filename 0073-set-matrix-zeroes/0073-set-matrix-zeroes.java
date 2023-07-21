class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean bo1 = false;
        boolean bo2 = false;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0]==0){
                bo1 = true;
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[0][i]==0){
                bo2 = true;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int i1 = 1; i1 < n; i1++) {
                if (matrix[i][i1]==0){
                    matrix[0][i1]=0;
                    matrix[i][0]=0;
                }

            }
        }
        for (int i = 1; i < m; i++) {
            for (int i1 = 1; i1 < n; i1++) {
                if (matrix[0][i1]==0 || matrix[i][0]==0){
                    matrix[i][i1]=0;

                }
            }
        }
        if (bo1){
            for (int i = 0; i < m; i++) {
                matrix[i][0]=0;
            }
        }
        if (bo2){
            for (int i = 0; i < n; i++) {
                matrix[0][i]=0;
            }
        }
    }
}