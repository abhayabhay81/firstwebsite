public class sudoku {
    public static boolean issafe(int sudiku[][],int row,int col,int digit){
        for (int i = 0; i <= 8 ; i++) {
            if (sudiku[i][col] == digit){
                return false;
            }
        }
        for (int i = 0; i <= 8; i++) {
            if (sudiku[row][i] == digit){
                return false;
            }
        }
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j < sc+3; j++) {
                if (sudiku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokusolver(int sudoko[][],int row ,int col){
        if (row == 9){
            return true;
        }

        int nextrow = row,nextcol = col+1;
        if (col+1 == 9){
            nextrow = row+1;
            nextcol = 0;
        }

        if (sudoko[row][col] != 0){
            return  sudokusolver(sudoko,nextrow,nextcol);
        }

        for (int i = 1; i <= 9; i++) {
            if (issafe(sudoko,row,col,i)){
                sudoko[row][col] = i;
                if (sudokusolver(sudoko,nextrow,nextcol)){
                    return true;
                }
                sudoko[row][col] = 0;
            }
        }
        return false;
    }
    public static void printsudoku(int sudoko[][]){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoko[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {
                {0,0,8,0,0,0,0,0,0},
                {4,9,0,1,5,7,0,0,2},
                {0,0,3,0,0,4,1,9,0},
                {1,8,5,0,6,0,0,2,0},
                {0,0,0,0,2,0,0,6,0},
                {9,6,0,4,0,5,3,0,0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3}
        };
        if (sudokusolver(sudoku,0,0)){
            System.out.println("sooution exists");
            printsudoku(sudoku);
        }else {
            System.out.println("soloution not exist");
        }
    }
}
