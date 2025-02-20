// more program is available in classroom.java class
public class nqueens {
    public static boolean nqueeses ( char bord[][], int row){
        if (row == bord.length) {
            count++;
            //printbord(bord);
            return true;
        }
        for (int i = 0; i < bord.length; i++) {
            if (issafe(bord, row, i)) {
                bord[row][i] = 'Q';
                if (nqueeses(bord, row + 1)){
                    return true;
                }
                bord[row][i] = 'X';
            }
        }
        return false;
    }
    public static boolean issafe ( char board[][], int row, int col){
        // vertical
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diog left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void printbord ( char bord[][]){
        System.out.println("-----------chess board-------");
        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord.length; j++) {
                System.out.print(bord[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count = 0;

    public static void main(String[] args) {
        int n=2;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] ='X';
            }
        }
        if (nqueeses(board,0)){
            System.out.println("solutom is possible");
            printbord(board);
        }else{
            System.out.println("solution is not poassible");
        }
    }
}
