public class knapsack_DP_problem {
    public static int knapsack(int val[],int wt[],int w,int n){
        if (w == 0 || n == 0){
            return 0;
        }
        if (wt[n-1] <= w){
            int ans1 = val[n-1]+knapsack(val,wt,w-wt[n-1],n-1);
            int ans2 = knapsack(val,wt,w,n-1);
            return Math.max(ans1,ans2);
        }else {
            return knapsack(val,wt,w,n-1);
        }
    }

    public static int knapsackmemo(int val[],int wt[],int w,int n,int dp[][]){
        if (w == 0 || n == 0){
            return 0;
        }
        if (dp[n][w] != -1){
            return dp[n][w];
        }
        if (wt[n-1] <= w){
            int ans1 = val[n-1]+knapsackmemo(val,wt,w-wt[n-1],n-1,dp);
            int ans2 = knapsackmemo(val,wt,w,n-1,dp);
            dp[n][w] = Math.max(ans1,ans2);
            return dp[n][w];
        }else {
            dp[n][w] = knapsackmemo(val,wt,w,n-1,dp);
            return dp[n][w];
        }
    }
    public static int kanpsacktabulation(int val[],int wt[],int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < W+1; j++) {
                int v = val[i-1];
                int w = wt[i-1];
                if (w <= j){
                    int incprofit = v + dp[i-1][j-w];
                    int excprofit = dp[i-1][j];
                    dp[i][j] = Math.max(incprofit,excprofit);
                }else {
                    int excprofit = dp[i-1][j];
                    dp[i][j] = excprofit;
                }
            }
        }
        print(dp);
        return dp[n][W];
    }
    public static void print(int dp[][]){
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;
        int dp[][] = new int[val.length+1][w+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
//        System.out.println(knapsack(val,wt,w,val.length));
//        System.out.println(knapsackmemo(val,wt,w,val.length,dp));
        System.out.println(kanpsacktabulation(val,wt,w));

    }
}
