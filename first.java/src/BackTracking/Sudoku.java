package BackTracking;

public class Sudoku {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if(solve(board)){
            display(board);
        }
        else {
            System.out.println("NOT ABLE TO SOLVE");
        }

    }

    static boolean solve(int[][] board){
        int n= board.length;
        int row=-1;
        int col=-1;
        boolean emptySpacer=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptySpacer= false;
                    break;

                }

            }
            if(emptySpacer==false){
                break;
            }
        }
        // sudoku is solved
        if(emptySpacer==true)
          return true;

        for (int nums = 1; nums <= 9; nums++) {
            if(isSafe(board,row,col,nums)){
                board[row][col]=nums;
                if(solve(board)){
                    return true;
                }
                else{
                    // backtrack
                    board[row][col]=0;
                }
            }
        }
        return false;
    }


    static boolean isSafe(int[][] board,int r,int c,int num){

        // for rows
        for(int i=0;i< board.length;i++){
            if(board[r][i] == num){
                return false;

            }
        }
        // for column
        for(int i=0;i< board.length;i++){
            if(board[i][c] == num){
                return false;

            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowEnd=r-r%sqrt;
        int colEnd=c-c%sqrt;

        for (int i = rowEnd; i < rowEnd+sqrt; i++) {
            for (int j = colEnd; j <colEnd+sqrt ; j++) {
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][] board) {
        for (int[] i: board) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


}
