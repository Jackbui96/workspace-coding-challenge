public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (checkCoordinate(board, word, visited, i, j, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean checkCoordinate(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0
                || j < 0
                || i > board.length - 1
                || j > board[i].length - 1
                || visited[i][j]
                || board[i][j] != word.charAt(index)) {
            return false;
        }

        visited[i][j] = true;

        if (checkCoordinate(board, word, visited, i + 1, j, index + 1)
                || checkCoordinate(board, word, visited, i, j + 1, index + 1)
                || checkCoordinate(board, word, visited, i - 1, j, index + 1)
                || checkCoordinate(board, word, visited, i, j - 1, index + 1)) {
            return true;
        }

        visited[i][j] = false;
        return false;
    }
}

