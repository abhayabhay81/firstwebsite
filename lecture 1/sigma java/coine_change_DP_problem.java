public class coine_change_DP_problem {
    public static int coinechange(int coine[],int sum){
        int n = coine.length;
        int dp[][] = new int[n+1][sum+1];

        // initialize - sum is 0
        // i -> coine j -> sum/change
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < sum+1; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if (coine[i-1] <= j){
                    dp[i][j] = dp[i][j-coine[i-1]]+dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int coine[] = {1,2,3};
        int sum = 4;
        System.out.println(coinechange(coine,sum));
    }
}
