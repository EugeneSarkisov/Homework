package Homework2;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] board = new String[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    board[i][j] = "W";
                } else if (i % 2 != 0 && j % 2 != 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
