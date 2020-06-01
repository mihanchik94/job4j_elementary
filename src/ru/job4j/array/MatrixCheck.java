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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int j = column; column < board.length; column++) {
            for (int i = 0; i < board[j].length - 1; i++) {
                if (board[i][j] != board[i + 1][j]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
