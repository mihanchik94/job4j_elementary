package ru.job4j.array;

public class MatrixCheck {
        public static boolean monoHorizontal(char[][] board, int row) {
            boolean result = true;
            for (int i = row; row < board.length; row++) {
                for (int j = 0; j < board[i].length - 1; j++) {
                    if (board[i][j] != board[i][j + 1]) {
                        result = false;
                        break;
                    }
                }
            }
            return result;
        }
}
