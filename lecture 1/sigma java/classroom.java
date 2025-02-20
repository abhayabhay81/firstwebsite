public class classroom {
    public static void chandearray(int arr[],int i,int val){
    // base case
        if (i == arr.length){
            printarr(arr);
            return;
        }

        // recurion
        arr[i] = val;
        chandearray(arr,i+1,val+1);
        arr[i] = arr[i]-2;
    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void findsubsets(String str,String ans,int i){
        // base cose
        if (i == str.length()){
            if (ans.length() == 1){
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }
        // yes choice
        findsubsets(str,ans+str.charAt(i),i+1);
        findsubsets(str,ans,i+1);
        //no choice
    }
    public static void findpermutation(String str,String ans){
        //bse case
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            findpermutation(newstr,ans+curr);
        }
    }

    //{
        public static void nqueeses ( char bord[][], int row){
        if (row == bord.length) {
            count++;
            printbord(bord);
            return;
        }
        for (int i = 0; i < bord.length; i++) {
            if (issafe(bord, row, i)) {
                bord[row][i] = 'Q';
                nqueeses(bord, row + 1);
                bord[row][i] = 'X';
            }
        }
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

  //  }
    public static void main(String[] args) {
//       int arr[] = new int[5];
//       chandearray(arr,0,1);
//       printarr(arr);
//        String str = "abc";
//        findsubsets(str," ",0);
//        findpermutation(str,"");
        int n=6;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] ='X';
            }
        }
        nqueeses(board,0);
        System.out.println("total numeber of ways is = "+count);
    }
}
