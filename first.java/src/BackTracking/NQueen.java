package BackTracking;

public class NQueen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queen(board,0));

    }

    static int queen(boolean[][] board,int row){
        if(row== board.length){
//            display(board);
//            System.out.println();
            return 1;
        }

        int count=0;
        for (int col = 0 ; col< board.length;col++){

            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=queen(board,row+1);
                board[row][col]=false;
            }
        }
        return count;

    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }


    private static void display(boolean[][] board) {

        for(boolean[] row:board){
            for(boolean col : row){
                if(col){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
