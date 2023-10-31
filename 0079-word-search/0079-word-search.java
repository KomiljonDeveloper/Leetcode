class Solution {
   public boolean exist(char[][] board, String word) {
        int m, n;
        m = board.length;
        n = board[0].length;

        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && wordSearch(board, word, visited, 0, i, j)) {
                    return true;
                }
            }
        }


        return false;
    }

    private boolean wordSearch(char[][] board, String word, boolean[][] visited, int c, int i, int j) {
        int m, n;
        m = board.length;
        n = board[0].length;

        if (c == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= m || j >= n) {
            return false;
        }

        if (word.charAt(c) == board[i][j] && !visited[i][j]) {
            visited[i][j] = true;
        } else {
            return false;
        }
        visited[i][j] = true;
        if (
                wordSearch(board, word, visited, c+1, i + 1, j) ||
                        wordSearch(board, word, visited, c+1, i, j + 1) ||
                        wordSearch(board, word, visited, c+1, i - 1, j) ||
                        wordSearch(board, word, visited, c+1, i, j - 1)
        ) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}